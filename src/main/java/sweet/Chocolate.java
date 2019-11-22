package sweet;

public class Chocolate extends Sweet {

    private String filling;

    public Chocolate(double weight, double price, String filling) {
        super(weight, price);
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Шоколадка " + filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }
}
