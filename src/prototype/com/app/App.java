// Problems with large classes
//1. Difficult to manage large list of attributes. have to create multiple constructors to manage optional parameters etc.
//2. Adding new attributes needs changes at multiple places
//3. Manage sequence of parameters

// Benefits of using builder pattern
//1. Multiple constructors (telescoping constructors)
//2. New attributes can be added without changes at multiple place
//3. Tread safe
//4. Immutable objects - as objects setters not added in main class

package prototype.com.app;

import builder.com.app.Person;

public class App {
    public static void main(String[] args) {
        Shape square = new Square(10, 5);
        square.draw();

        Shape square2 = square.cloneShape();
        square2.draw();
    }
}