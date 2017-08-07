package factory;

import factory.operator.OperatorFactory;
import factory.operator.base.Operator;

public class Test {
    public static void main(String[] args) {
        Operator operator = OperatorFactory.getOperator("+");
        operator.setNumberA(1);
        operator.setNumberB(1);
        System.out.println(operator.getResult());
    }
}
