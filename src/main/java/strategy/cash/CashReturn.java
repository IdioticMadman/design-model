package strategy.cash;

public class CashReturn implements CashSuper {
    @Override
    public double acceptCrash(double money) {
        return 0;
    }
}
