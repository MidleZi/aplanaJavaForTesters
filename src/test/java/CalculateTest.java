import calculator.Calculator;
import calculator.Operand;
import calculator.Operation;
import org.junit.Test;

import java.util.logging.Logger;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.*;


public class CalculateTest {

    protected static Logger LOG = Logger.getLogger(CalculateTest.class.getName());

    @Test
    public void сложение() {
        Operand first = new Operand("Первый операнд", 15.6);
        Operand second = new Operand("Второй опранд", 15.4);
        Operation operation =  new Operation("Сложение", "+");
        Double result;

        LOG.info("Начинаю тест на сложение. Вычисляю выражение " + first.getValue() + " " + operation.getValue() + " " + second.getValue());
        Calculator calc = new Calculator(first, second,operation);
        result = calc.calculate();
        LOG.info("Результат выражения " + first.getValue() + " " + operation.getValue() + " " + second.getValue() + " = " + result);
        assertEquals(result, new Double(31));
        LOG.info("Тест завершился успешно");
    }

    @Test
    public void вычитание() {
        Operand first = new Operand("Первый операнд", 15.6);
        Operand second = new Operand("Второй опранд", 15.4);
        Operation operation =  new Operation("Вычитание", "-");
        Double result;

        LOG.info("Начинаю тест на вычитание. Вычисляю выражение " + first.getValue() + " " + operation.getValue() + " " + second.getValue());
        Calculator calc = new Calculator(first, second,operation);
        result = calc.calculate();
        LOG.info("Результат выражения " + first.getValue() + " " + operation.getValue() + " " + second.getValue() + " = " + result);
        assertEquals(result, new Double(0.2));
        LOG.info("Тест завершился успешно");
    }

    @Test
    public void умножение() {
        Operand first = new Operand("Первый операнд", 15.6);
        Operand second = new Operand("Второй опранд", 15.4);
        Operation operation =  new Operation("Умножение", "*");
        Double result;

        LOG.info("Начинаю тест на умножение. Вычисляю выражение " + first.getValue() + " " + operation.getValue() + " " + second.getValue());
        Calculator calc = new Calculator(first, second,operation);
        result = calc.calculate();
        LOG.info("Результат выражения " + first.getValue() + " " + operation.getValue() + " " + second.getValue() + " = " + result);
        assertEquals(result, new Double(240.24));
        LOG.info("Тест завершился успешно");
    }

    @Test
    public void деление() {
        Operand first = new Operand("Первый операнд", 15.6);
        Operand second = new Operand("Второй опранд", 15.4);
        Operation operation =  new Operation("Деление", "/");
        Double result;

        LOG.info("Начинаю тест на деление. Вычисляю выражение " + first.getValue() + " " + operation.getValue() + " " + second.getValue());
        Calculator calc = new Calculator(first, second,operation);
        result = calc.calculate();
        LOG.info("Результат выражения " + first.getValue() + " " + operation.getValue() + " " + second.getValue() + " = " + result);
        assertEquals(result, new Double(1.01));
        LOG.info("Тест завершился успешно");
    }
}
