package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operand {

    private String name;
    private Double value;

    public Operand(String name) {
        System.out.println("Введите " + name);
        this.name = name;
        this.value = readDoubleFromConsole();
    }

    public Operand(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    private static double readDoubleFromConsole() {
        double doub = 0;
        boolean isNumericCourse = false;
        while (!isNumericCourse) {
            try {
                String str = readFromConsole();
                if (str.contains(",")) {
                    str = str.replace(",", ".");
                }
                doub = Double.parseDouble(str);
                isNumericCourse = true;
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели некорректное число, попробуйте еще раз");
            }
        }
        return doub;
    }

    private static String readFromConsole() {
        String result = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            result = bufferedReader.readLine();
        } catch (IOException | NullPointerException e) {
            System.out.println(e);
        }
        return result;
    }

}
