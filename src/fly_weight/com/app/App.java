//Fly Weight is a structural design pattern
//It aims to reduce memory consumption by using existing objects
//it creates single objects for similar properties and reuse it


// Java String Constants pool(HEAP memory)
//String s = "val"; -> java stores value only once in string constants pool. new string literal with same value will refer to existing object
// String S = new String("val"), Java will store value in Java String Constants pool along with object reference in heap memory

package fly_weight.com.app;

public class App {
    public static void main(String[] args) {
        ShapeSimulator simulator = new ShapeSimulator();
        simulator.run(20);
    }
}

// shape interface - draw methos
//Rectangle class - implements share
//ShapeFactory - it will have list of shapes along wth colors,
// FlyWeightSimulator - create shapes


