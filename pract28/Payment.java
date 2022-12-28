package pract28;

public class Payment {
    PaymentStrategy paymentStrategy;

    public void askData(){
        paymentStrategy.askData();
    }
}
