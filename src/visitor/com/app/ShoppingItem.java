package visitor.com.app;

public interface ShoppingItem {
    public double accept(Visitor visitor);
}
