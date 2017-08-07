package strategy.cash;

public class CashRebate implements CashSuper {

    private final double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCrash(double money) {
        return money * moneyRebate;
    }
}
