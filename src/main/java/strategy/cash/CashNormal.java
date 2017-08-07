package strategy.cash;

public class CashNormal implements CashSuper{

    @Override
    public double acceptCrash(double money) {
        return money;
    }
}
