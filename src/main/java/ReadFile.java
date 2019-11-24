import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class ReadFile {


    public static List<String> crateListFromFile(){
        List<String> list;
        try {
            BufferedReader bufferedReader = new BufferedReader( new FileReader("src/main/resources/words.txt"));
            list = Arrays.asList(bufferedReader.readLine().split(" "));
            Collections.sort(list);
            return list;
        } catch (IOException e) {
            System.out.println("нет файла");
        }
        return null;
    }

    public static void  countElements(List<String> list) {
        List<String> listToMap = list;

        Map<String, Integer> tm = new TreeMap<String, Integer>();
        Integer am;
        for (String i : list) {

            am = tm.get(i);
            tm.put(i, am == null ? 1 : am + 1);
        }
        System.out.println(tm);
    }

    public static void  maxCountElements(List<String> list) {
        List<String> listToMap = list;
        String maxCountElement = null;
        Integer maxCount = 0;
        Map<String, Integer> tm = new TreeMap<String, Integer>();
        Integer am;
        for (String i : list) {
            am = tm.get(i);
            tm.put(i, am == null ? 1 : am + 1);
        }

        for(Map.Entry<String, Integer> item : tm.entrySet()){
            if(item.getValue() >= maxCount) {
                maxCount = item.getValue();
                maxCountElement = item.getKey();
            }
        }

        System.out.println("Слово \"" + maxCountElement + "\" встречается в файле " + maxCount + " раз(а)" );
    }

}
