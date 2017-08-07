package factory.operator;

import factory.operator.base.Operator;

public class OperatorFactory {
    public static Operator getOperator(String str) {
        Operator operator;
        switch (str) {
            case "+":
                operator = new OperatorAdd();
                break;
            case "-":
                operator = new OperatorSub();
                break;
            case "*":
                operator = new OperatorMul();
                break;
            case "/":
                operator = new OperatorDiv();
                break;
            default:
                operator = null;
                break;
        }
        return operator;
    }
}
