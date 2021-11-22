package assignment5;

public class PayPal implements PaymentStrategy {
    String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("PayPal : $" + amount);
    }
}
