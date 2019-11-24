package calculator;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Calculator {

    private Operand firstOperand;
    private Operand secondOperand;
    private Operation operation;
    private Double result;
    private boolean isAllCorrect = false;


    public Calculator(Operand firstOperand, Operand secondOperand, Operation operation) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operation = operation;
    }

    public Double calculate() {
        while (result == null || !isAllCorrect) {
            switch (operation.getValue()) {
                case ("+"):
                    result = firstOperand.getValue() + secondOperand.getValue();
                    isAllCorrect = true;
                    break;
                case ("-"):
                    result = firstOperand.getValue() - secondOperand.getValue();
                    isAllCorrect = true;
                    break;
                case ("*"):
                    result = firstOperand.getValue() * secondOperand.getValue();
                    isAllCorrect = true;
                    break;
                case ("/"):
                    try {
                        result = firstOperand.getValue() / secondOperand.getValue();
                        isAllCorrect = true;
                        if (result == Infinity) {
                            throw new Exception();
                        }
                    } catch (Exception ex) {
                        System.out.println("Нельзя делить на 0!!! А то мир взорвется!!!");
                        isAllCorrect = false;
                        operation =  new Operation("Операция");
                    }
                    break;
                default:
                    boolean isOperation = false;
                    while (!isOperation) {
                        System.out.println("Вы ввели некоректную операцию. Попробуйте еще раз.");
                        operation.setValue();
                        isOperation = true;
                    }
                    break;
            }
        }
        return Math.rint(100.0 * result) / 100.0;
    }


}
