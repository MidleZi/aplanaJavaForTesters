package sweet;

public class Waffles extends Sweet {

    private String taste;

    public Waffles(double weight, double price, String taste) {
        super(weight, price);
        this.taste =taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String toString() {
        return "Вафли " + taste;
    }
}
