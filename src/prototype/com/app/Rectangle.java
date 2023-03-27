package prototype.com.app;

public class Rectangle extends Shape {
    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle of height: " + height + " width: " + width);
    }

    @Override
    public Shape cloneShape() {
        return new Rectangle(this.height, this.width);
    }
}
