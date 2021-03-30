package study.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        OperationSingleton instance = OperationSingleton.getInstance();
        int firstName = 100;
        int secondNumber = 20;

        instance.operate(OperationSingleton.ADD_OPERATION, firstName, secondNumber);
        instance.operate(OperationSingleton.SUBSTRACT_OPERATION, firstName, secondNumber);
        instance.operate(OperationSingleton.MULTIPLY_OPERATION, firstName, secondNumber);
        instance.operate(OperationSingleton.DIVIDE_OPERATION, firstName, secondNumber);
    }
}
