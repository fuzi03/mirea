public abstract class task4_Shape {
    protected String color;
    protected boolean filled;

    public task4_Shape() {

    }
    task4_Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
