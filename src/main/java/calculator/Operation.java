package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operation {

    private String name;
    private String value;

    public Operation(String name) {
        System.out.println("Введите " + name);
        this.name = name;
        this.value = readFromConsole();
    }

    public Operation(String name, String value) {
        this.name = name;
        this.value = value;
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

    public String getValue() {
        return value;
    }

    public void setValue(){
        this.value = readFromConsole();
    }
}
