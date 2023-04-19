package visitor.com.app;

import java.util.ArrayList;
import java.util.List;

public class Cart extends ArrayList<ShoppingItem> {

    private final ShoppingCartVisitor visitor;

    public Cart(ShoppingCartVisitor visitor) {
        this.visitor = visitor;
    }

    public double value() {
        double sum = 0;
        for (ShoppingItem shoppingItem : this) {
            sum += shoppingItem.accept(visitor);
        }
        return sum;
    }
}
