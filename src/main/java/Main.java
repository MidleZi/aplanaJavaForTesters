import sweet.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Present present = new Present();

        present.add(new Candy(150, 15.56, 20));
        present.add(new Waffles(200, 50.45, "Шоколадные"));
        present.add(new Chocolate(100, 150, "С цельным фундуком"));

        present.printContentPresent();


    }
}
