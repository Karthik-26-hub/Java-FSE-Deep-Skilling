public class Main {

    public static void main(String[] args) {

        PaymentContext p1 =
                new PaymentContext(new CreditCardPayment());

        p1.executePayment(1000);

        PaymentContext p2 =
                new PaymentContext(new PayPalPayment());

        p2.executePayment(2000);
    }
}