package prototype_clone.com.app;

public class Square extends Shape {
    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square of height: " + height + " width: " + width);
    }

    @Override
    protected Shape clone() {
        return new Square(this.height, this.width);
    }
}
