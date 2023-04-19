package visitor.com.app;

public class ShoppingCartVisitor implements Visitor{

//    #Todo: Check if patterns is implemented correctly.Open close principle violated when new Items introduced.
//    Alternative could be -> public double visit(ShoppingItem item)
    @Override
    public double visit(Table table) {
        return table.getPrice();
    }

    @Override
    public double visit(Chair chair) {
        return chair.getPrice();
    }
}

//public class ShoppingCartVisitor implements Visitor{
//    @Override
//    public double visit(ShoppingItem item) {
//        return item.getPrice();
//    }
//
//}
