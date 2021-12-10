package pt.up.fe.ldts.example3;

public class Percentage extends Discount{
    private final double percentage;
    public Percentage(double percentage) {
        super();
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price){
        return price - price * percentage;
    }
}
