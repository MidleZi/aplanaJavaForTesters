import calculator.Calculator;
import calculator.Operand;
import calculator.Operation;
import sweet.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Задание №2
        // ProcedurePrograms.calulator();

        //Задание №3
        ProcedurePrograms.minMaxStringArray();
        ProcedurePrograms.calculatorOrMinMaxStringArray();

        //Задание №4
        ProcedurePrograms.massiveReplaceMinAndMaxElement();
        present();

        //Задание №5
        calculator();

        //Задание №6
        maxCountElement();

        //Задание №7
        //Я использовал класс Double в калькуляторе, он возвращает при делении на 0 Infinity
        //Поэтому я сам выбрасываю тут исключение и тут же его обрабатываю
        //Такой вот бессмысленный костыль, чтобы выполнить задание))

        //Задание №8
        //Все тесты там, где им положено быть src/test/java/CalculateTest.java
    }

    public static void present() {
        Present present = new Present();
        present.add(new Candy(150, 15.56, 20));
        present.add(new Waffles(200, 50.45, "Шоколадные"));
        present.add(new Chocolate(100, 150, "С цельным фундуком"));
        present.printContentPresent();
    }

    public static void calculator() {
        Calculator calc = new Calculator(new Operand("Первый операнд"), new Operand("Второй операнд"), new Operation("Операция"));
        double res = calc.calculate();
        System.out.printf("%.4f", res);
        System.out.println("\n");
    }

    public static void maxCountElement() {
        List<String> list = ReadFile.crateListFromFile();
        ReadFile.countElements(list);
        ReadFile.maxCountElements(list);
    }


}
