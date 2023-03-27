package prototype_clone.com.app;

public abstract class Shape implements Cloneable {
    protected int width;
    protected int height;

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public abstract void draw();
}
