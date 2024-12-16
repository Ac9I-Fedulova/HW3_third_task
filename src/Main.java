public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println((int)service.calculate(1_000_000,12,9.99) + " Руб.");



    }
}