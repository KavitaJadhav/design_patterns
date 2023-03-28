package visitor.com.app;

public class ShoppingCartVisitor implements Visitor{
    @Override
    public double visit(Table table) {
        return table.getPrice();
    }

    @Override
    public double visit(Chair chair) {
        return chair.getPrice();
    }
}
