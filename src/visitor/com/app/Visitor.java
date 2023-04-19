package visitor.com.app;

public interface Visitor {
    public double visit(Table table);
    public double visit(Chair chair);
}

//public interface Visitor {
//    public double visit(ShoppingItem item);
//}
