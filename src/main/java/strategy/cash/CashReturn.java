package strategy.cash;

public class CashReturn implements CashSuper {

    private final double moneyReturn;
    private final double moneyCondition;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCrash(double money) {
        if (money >= moneyCondition) {
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }
}
