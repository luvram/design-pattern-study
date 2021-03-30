package study.designpattern.singleton;

public class OperationSingleton {
    public static final int ADD_OPERATION = 1;
    public static final int SUBSTRACT_OPERATION = 2;
    public static final int MULTIPLY_OPERATION = 3;
    public static final int DIVIDE_OPERATION = 4;

    private static OperationSingleton singleton = new OperationSingleton();

    private OperationSingleton() {
        super();
    }

    public static OperationSingleton getInstance() {
        return singleton;
    }

    public void operate(int operatorType, int firstNumber, int secondNumber) {
        int answer = 0;
        String operator = null;
        switch (operatorType) {
            case ADD_OPERATION:
                answer = firstNumber + secondNumber;
                operator = "+";
                break;
            case SUBSTRACT_OPERATION:
                answer = firstNumber - secondNumber;
                operator = "-";
                break;
            case MULTIPLY_OPERATION:
                answer = firstNumber * secondNumber;
                operator = "*";
                break;
            case DIVIDE_OPERATION:
                answer = firstNumber/secondNumber;
                operator = "/";
                break;
        }

        String result = firstNumber + operator + secondNumber + " = " + answer;
        System.out.println(result);
    }
}
