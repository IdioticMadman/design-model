package factory.operator;

import factory.operator.base.Operator;

public class OperatorDiv extends Operator {

    @Override
    public double getResult() {
        return this.getNumberA() / this.getNumberB();
    }
}
