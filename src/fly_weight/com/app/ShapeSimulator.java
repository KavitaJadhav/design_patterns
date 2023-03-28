package fly_weight.com.app;

import command.com.app.Command;

import java.util.Random;

public class ShapeSimulator {
    private String[] colors = {"RED", "GREEN", "BLUE"};
    private Random random = new Random();

    private ShapeFactory shapeFactory;

    public ShapeSimulator() {
        shapeFactory = new ShapeFactory();
    }

    public void run(int times) {
        for (int i = 0; i < times; i++) {
            Rectangle rectangle = (Rectangle) shapeFactory.getShape(getRandomColor());
            rectangle.setX_coordinate(getRandonX_coordinate());
            rectangle.setY_coordinate(getRandonY_coordinate());

            rectangle.draw();
        }
    }

    private String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }

    private int getRandonX_coordinate() {
        return random.nextInt(100);
    }

    private int getRandonY_coordinate() {
        return random.nextInt(100);
    }
}
