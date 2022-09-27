public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball(0.0, 0.0);
        System.out.print(ball);
        ball.move(1.5, 2.0);
        System.out.print(ball);
    }
}
