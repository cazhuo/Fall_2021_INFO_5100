package assignment5;

public class CreditCard implements PaymentStrategy{
    private String cardNumber;

    public CreditCard(String cn) {
        this.cardNumber = cn;
    }

    @Override
    public void pay(int amount) {
        System.out.println("CreditCard : $" + amount);
    }
}
