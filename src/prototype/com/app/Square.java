package prototype.com.app;

public class Square extends Shape {
    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square of height: " + height + " width: " + width);
    }

    @Override
    public Shape cloneShape() {
        return new Square(this.height, this.width);
    }
}
