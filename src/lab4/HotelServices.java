package lab4;

import lab4.colors.Colors;
import lab4.exceptions.OutOfMoneyException;
import lab4.exceptions.OutOfOrderException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public enum HotelServices {

    PILLOW(2, "подушка"),
    BLANKET(1, "одеяло"),
    BED(3, "кровать"),
    WIFI(10, "вайфай 1 мбит/с"),
    HEATING(2, "отопление"),
    WATER(2, "вода 5 мин", true, 5),
    LIGHT(1, "свет 10 мин", true, 10),
    TV(5, "телевизор 10 мин", true, 10),
    MAID(1, "горничная");

    public final int price;
    public final String name;
    public boolean isTemporary = false;
    public int defaultTime = 0;

    HotelServices(int price, String name) {
        this.price = price;
        this.name = name;
    }

    HotelServices(int price, String name, boolean isTemporary, int defaultTime) {
        this.price = price;
        this.name = name;
        this.isTemporary = isTemporary;
        this.defaultTime = defaultTime;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return Colors.ANSI_PURPLE + this.name + Colors.ANSI_RESET;
    }

    public String toString() {
        return "\n%s - %s".formatted(this.getName(), this.getPrice());
    }

    public static ArrayList<String> getNotTemporaryAllServices() {
        ArrayList<String> services = new ArrayList<>();
        for (HotelServices service : HotelServices.values()) {
            if (!service.isTemporary) {
                services.add(service.toString());
            }
        }
        return services;
    }

    public class Tongue {
        public HotelServices service;

        public Tongue() {
            this.service = HotelServices.this;
            System.out.println(this.appear());
        }

        public String appear() {
            return "Появился язычок с надписью: " + Colors.ANSI_CYAN + "\"Заплатите %s сантиков за %s\""
                    .formatted(this.service.getPrice(), this.service.getName()) + Colors.ANSI_RESET;
        }

        public boolean pay(MoneySpender spender) {
            boolean isPaid = false;
            try {
                spender.spendMoney(this.service);
                isPaid = true;
            } catch (OutOfMoneyException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Язычок исчез");
            }
            return isPaid;
        }
    }

    public static class TemporaryServiceState {

        Map<HotelServices, Integer> temporaryServiceLeft;

        public TemporaryServiceState() {
            temporaryServiceLeft = new HashMap<>() {{
                for (HotelServices service : HotelServices.values()) {
                    if (service.isTemporary) {
                        put(service, service.defaultTime);
                    }
                }
            }};
        }

        public void update(MoneySpender spender) {

            class StateUpdater {
                public StateUpdater() {

                }

                public void proceedUpdate() {
                    for (HotelServices serv : temporaryServiceLeft.keySet()) {
                        if (temporaryServiceLeft.get(serv) > 0) {
                            temporaryServiceLeft.put(serv, temporaryServiceLeft.get(serv) - 1);
                            if (temporaryServiceLeft.get(serv) == 0) {
                                System.out.printf("Услуга %s закончилась%n", serv.getName());
                                Tongue tongue = serv.new Tongue();
                                if (tongue.pay(spender)) {
                                    temporaryServiceLeft.put(serv, serv.defaultTime);
                                } else {
                                    throw new OutOfOrderException("%s будет сидеть без %s%n".formatted(spender, serv.getName()));
                                }
                            }
                        }
                    }
                }
            }

            new StateUpdater().proceedUpdate();

        }

        public boolean isAnyTemporaryServiceActive() {
            for (HotelServices serv : this.temporaryServiceLeft.keySet()) {
                if (this.temporaryServiceLeft.get(serv) > 0) {
                    return true;
                }
            }
            return false;
        }


    }
}
