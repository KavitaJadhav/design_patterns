package fly_weight.com.app;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    Map<String, Shape> shapes;

    public ShapeFactory() {
        shapes = new HashMap();
    }

    public Shape getShape(String color) {

        if (shapes.containsKey(color)) {
            return shapes.get(color);
        }

        System.out.println("Adding new shape for color: " + color);
        Shape rectangle = new Rectangle(color);
        shapes.put(color, rectangle);
        return rectangle;
    }

}
