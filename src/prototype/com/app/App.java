//Creational Pattern
//prototype factory pattern is used to create objects of same class with same values
//helps in ensure abstraction and encapsulation as behaviour is present in class itself(clone method)
//Can be achieved using Cloneable interface
//create a clone method in class and return new instance of class with all attribute values

package prototype.com.app;

public class App {
    public static void main(String[] args) {
        Shape square = new Square(10, 5);
        square.draw();

        Shape square2 = square.cloneShape();
        square2.draw();
    }
}