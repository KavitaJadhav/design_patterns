//Behavioural Pattern
//Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects.
//With the help of visitor pattern, we can move the operational logic from the objects to another class.
//It decouples the operations from an object structure. We can add behaviour for existing classes

//Get sum of items in shopping cart

//Description - site visitor adds items in cart and checks for cart value. Multiple visitors can access same details on same item
//Items are accepting visitor and

package visitor.com.app;

public class App {

    public static void main(String[] args) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitor();

        Cart cart = new Cart(visitor);
        cart.add(new Chair("Office", 100));
        cart.add(new Chair("Dining", 70));
        cart.add(new Table("Desc", 150));

        cart.value();
        System.out.println("Cart total: " + cart.value());
    }
}

//ShoppingItem Interface
//Table, Chair implements - ShoppingItem
//Visitor(methods to add item items)
//ShoppingCartVisitor implements Visitor