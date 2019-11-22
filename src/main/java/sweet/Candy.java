package sweet;

public class Candy extends Sweet {

    private int countInBox;

    public Candy(double weight, double price, int countInBox) {
        super(weight, price);
        this.countInBox = countInBox;
    }

    public int getCountInBox() {
        return countInBox;
    }

    public void setCountInBox(int countInBox) {
        this.countInBox = countInBox;
    }

    @Override
    public String toString() {
        return "Конфеты. В упаковке " + countInBox + " штук.";
    }
}
