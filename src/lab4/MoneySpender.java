package lab4;

import lab4.exceptions.OutOfMoneyException;

public interface MoneySpender {
    void spendMoney(HotelServices service) throws OutOfMoneyException;

    int getMoney();

    boolean checkIsLeft();

    void addMoney(Money money);
}
