package visitor.com.app;

public class Table implements ShoppingItem{
    private String type;
    private double price;

    public Table(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
