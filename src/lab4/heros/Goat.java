package lab4.heros;

import lab4.*;
import lab4.exceptions.OutOfMoneyException;

public class Goat extends Hero implements Watcher, MoneySpender  {

    private int money;

    public Goat() {
        this.name = "Козлик";
    }

    @Override
    public void watch(History history) {
        for (Clause clause : history.getClauses()) {
            System.out.println("%s, жуя попкорн, посмотрел: %s. Он подумал: \"%s\"".formatted(this.name, clause, react()));
        }
    }

    @Override
    public void spendMoney(HotelServices service) throws OutOfMoneyException {
        if (this.money < service.getPrice()) {
            throw new OutOfMoneyException("У козлика нет столько денег");
        }
        System.out.println(this.name + " заплатил " + service.getPrice() + " сантиков за " + service.getName());
        this.money = Math.max(0, this.money - service.getPrice());
    }

    @Override
    public int getMoney() {
        return this.money;
    }

    @Override
    public void addMoney(Money money) {
        this.money += money.getValue();
    }

    @Override
    public boolean checkIsLeft() {
        return this.money > 0;
    }



}
