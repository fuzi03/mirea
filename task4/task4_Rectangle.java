public class task4_Rectangle extends task4_Shape {
    protected double width;
    protected double length;

    public task4_Rectangle() {

    }

    /*task4_Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }*/
    task4_Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle: " + "width " + width + ", " + "length " + length;
    }
}
