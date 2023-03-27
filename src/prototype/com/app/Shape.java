package prototype.com.app;

public abstract class Shape {
    protected int width;
    protected int height;

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public abstract void draw();

    public abstract Shape cloneShape();
}
