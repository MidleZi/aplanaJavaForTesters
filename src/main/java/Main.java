import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        calulator();
    }

    public static void calulator(){
        double a, b;
        String deystvie;
        boolean isStop = false;
        System.out.println("Введите первое число:");
        a = readDoubleFromConsole();
        System.out.println("Введите второе число:");
        b = readDoubleFromConsole();
        System.out.println("Введите действие (+, -, *, /) :");
        while (!isStop) {
            deystvie = readFromConsole();
            switch (deystvie) {
                case ("+"):
                    System.out.print("Сумма равна: ");
                    System.out.printf("%.4f", a + b);
                    isStop = true;
                    break;
                case ("-"):
                    System.out.print("Разность равна: ");
                    System.out.printf("%.4f", a - b);
                    isStop = true;
                    break;
                case ("*"):
                    System.out.print("Произведение равно: ");
                    System.out.printf("%.4f", a * b);
                    isStop = true;
                    break;
                case ("/"):
                    System.out.print("Частное равно: ");
                    System.out.printf("%.4f", a / b);
                    isStop = true;
                    break;
                default:
                    System.out.println("Вы ввели некорректное действие, попробуйте еще раз");
                    break;
            }
        }
    }


    /** Данный метод считывает  с консоли введеное пользователем  число*/
    public static double readDoubleFromConsole() {
        double doub = 0;
        boolean isNumericCourse = false;
        while(!isNumericCourse) {
            try {
                String str = readFromConsole();
                if(str.contains(",")) { str = str.replace(",", "."); }
                doub = Double.parseDouble(str);
                isNumericCourse = true;
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели некорректное число, попробуйте еще раз");
            }
        }
        return doub;
    }

    /** Данный метод считывает введеную пользователм строку с консоли*/
    public static String readFromConsole() {
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
