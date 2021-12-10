package pt.up.fe.ldts.example3;

public class Fixed extends Discount{
    private final int fixed;

    public Fixed(int fixed) {
        super();
        this.fixed = fixed;
    }

    @Override
    public double applyDiscount(double price){
        return fixed > price ? 0 : price - fixed;
    }
}
