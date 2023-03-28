package fly_weight.com.app;

public class Rectangle implements Shape {
    private String color;
    private int x_coordinate;
    private int y_coordinate;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape of color: " + color + ", x_coordinate: " + x_coordinate + ", y_coordinate" + y_coordinate);
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }
}
