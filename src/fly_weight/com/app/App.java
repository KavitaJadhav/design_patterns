//Fly Weight is a structural design pattern
//Extrinsic state - not part of original object, dynamic state changed, Added later explicitly(Extrinsic meaning - not part of original nature)
//Intrinsic state - Part of original object, constant data(Intrinsic meaning - belong to original nature)

//It aims to reduce memory consumption by using existing objects
//it creates single objects for similar properties and reuse it(refers to) at multiple places
//Used in game development to create similar objects.


//Java String Constants pool(HEAP memory)
//String s = "val"; -> java stores value only once in string constants pool. new string literal with same value will refer to existing object
//String S = new String("val"), Java will store value in Java String Constants pool along with object reference in heap memory


//Explanation
//draw rectangle of different colors(Static color - Red, Green, Blue)
//Dynamic X, Y co-ordinates

//Shape interface - draw method
//Rectangle class - implements Shape
//ShapeFactory - it will have list of shapes along wth colors,
// FlyWeightSimulator - create shapes

package fly_weight.com.app;

public class App {
    public static void main(String[] args) {
        ShapeSimulator simulator = new ShapeSimulator();
        simulator.run(20);
    }
}




