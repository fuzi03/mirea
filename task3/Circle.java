public class Circle {

    private double radix;

    public Circle(double radix) {
        this.radix = radix;
    }

    public Circle() {
    }

    public double getRadix() {
        return radix;
    }

    public void setRadix(double radix) {
        this.radix = radix;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radix=" + radix +
                '}';
    }
}

//TEST отдельно в папку

public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle();

        circle.setRadix(123.5);

        System.out.println(circle);
    }
}