//Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects.
// With the help of visitor pattern, we can move the operational logic from the objects to another class.
//It decouples the operations from an object structure. We can add behaviour for existing classes

package visitor.com.app;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Chair("Office", 100));
        items.add(new Chair("Dining", 70));
        items.add(new Table("Desc", 150));


        ShoppingCartVisitor visitor = new ShoppingCartVisitor();
        double sum = 0;


        for (ShoppingItem shoppingItem : items) {
            sum += shoppingItem.accept(visitor);

        }

        System.out.println("Cart total: " + sum);
    }

}

//ShoppingItem Interface
//Table, Chair implements - ShoppingItem
//Visitor(methods to add item items)
//ShoppingCartVisitor implements Visitor