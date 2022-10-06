
public class Hand {
    private double length;
    private double weight; 

    public Hand(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }
    public Hand() {
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Hand{" +
                "length='" + length + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}


public class Head {
    private double length;
    private double weight; 

    public Head(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }
    public Head() {
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Head{" +
                "length='" + length + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}


public class Leg {
    private double length;
    private double weight; 

    public Leg(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }
    public Leg() {
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "{" +
                "length='" + length + '\'' + ", weight='" + weight + '\'' + '}';
    }
}


public class Human {
    private Hand hand;
    private Head head;
    private Leg leg;

    public Human(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }
    public Human() {
    }
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public Head getHead() {
        return head;
    }
    public void setHead(Head head) {
        this.head = head;
    }
    public Leg getLeg() {
        return leg;
    }
    public void setLeg(Leg leg) {
        this.leg = leg;
    }
    @Override
    public String toString() {
        return "Human{" + "hand='" + hand + '\'' + ", head='" + head + '\'' + ", leg='" + leg + '\'' + '}';
    }
}
public class HumanTest {
    public static void main(String[] args){
        Human human = new Human();

        human.setHand(new Hand(10, 1));
        human.setHead(new Head(20, 3));
        human.setLeg(new Leg(8, 1.5));

        System.out.println(human);
    }
}