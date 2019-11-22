package sweet;

import java.util.ArrayList;
import java.util.List;

public class Present {

    private double resultWight;
    private double resultPrice;
    private List<Sweet> content;

    public Present() {
        this.content = new ArrayList<>();
    }

    public void add(Sweet sweet) {
        content.add(sweet);
    }

    public void printContentPresent() {
        for (Sweet sweet : content) {
            resultPrice = resultPrice + sweet.getPrice();
            resultWight = resultWight + sweet.getWeight();
            System.out.println(sweet.toString());
        }
        System.out.println("Общий вес составляет: " + resultWight);
        System.out.println("Будьте добры оплатить: " + resultPrice);
    }


}
