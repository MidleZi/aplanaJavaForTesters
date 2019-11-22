import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ProcedurePrograms {



    /**
     * В зависимости от желания пользователя запускает калькулятор или minMaxStringArray
     */
    public static void calculatorOrMinMaxStringArray() {
        boolean isStop = false;
        while(!isStop){
            String choice =null;
            System.out.println("Введите 1, чтобы воспользоваться калькулятором или 2 чтобы поиграться с массивами");
            System.out.println("Чтобы выйти введите \"@exit\"");
            choice = readFromConsole();
            switch (choice) {
                case("1"):
                    calulator();
                    isStop = true;
                    break;
                case("2"):
                    minMaxStringArray();
                    isStop = true;
                    break;
                case("@exit"):
                    isStop = true;
                    break;
                default:
                    System.out.println("Вы ввели неправильное действие, попробуйте еще раз");
            }
        }
    }

    /**
     * Простой калькулятор
     */
    public static void calulator() {
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


    /**
     * Данный метод считывает  с консоли введеное пользователем  число
     */
    public static double readDoubleFromConsole() {
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

    /**
     * Данный метод считывает введеную пользователм строку с консоли
     */
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

    /** Метод создает и возвращает массив String'ов заданной пользователем длинны
     * а так же пользоватеем и заполняется
     * @return
     */
    public static String[] createStringArray() {
        int x = 0;
        String array[];
        boolean isArrayCreate = false;
        System.out.println("Введите необходимое кол-во элементов массива");
        while (!isArrayCreate) {
            try {
                x = Integer.parseInt(readFromConsole());
                isArrayCreate = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число");
            }
        }

        array = new String[x];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите значение элемента №" + (i + 1));
            array[i] = readFromConsole();
        }
        return array;
    }

    /**
     * Метод ищет в массиве String[] самую длинную и самую короткую строки
     */
    public static void minMaxStringArray() {
        String array[] = createStringArray();
        String maxElement = array[0];
        String minElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxElement.length() < array[i].length()) {
                maxElement = array[i];
            } else if (minElement.length() > array[i].length()){
                minElement = array[i];
            }
        }
        System.out.println("Минимальная по длинне строка \"" + minElement + "\"");
        System.out.println("Максимальная по длинне строка \"" + maxElement + "\"");
    }

    /**
     * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
     * Находит максимальный отрицательный и минимальный положительный элементы массива. Меняет их местами.*/
    public static void massiveReplaceMinAndMaxElement() {
        Random random = new Random();

        int array[] = new int[20];
        int maxNegativeElement = -10;
        int minPositiveElement = 10;
        int maxNegativePosition = 0;
        int minPositivePosition = 0;

        for (int i = 0; i < 20; i++) {
            int num = -10 + random.nextInt(21 );
            array[i] = num;
            if(array[i] < 0 && maxNegativeElement < array[i]) { maxNegativeElement = array[i]; maxNegativePosition = i; }
            if(array[i]> 0 && minPositiveElement > array[i]) { minPositiveElement = array[i]; minPositivePosition = i; }
            System.out.println("minPositiveElement " + minPositiveElement);
            System.out.println(num);
        }
        array[minPositivePosition] = maxNegativeElement;
        array[maxNegativePosition] = minPositiveElement;
    }
}
