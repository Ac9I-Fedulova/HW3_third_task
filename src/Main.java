public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println((int) service.calculate(1_000_000, 12, 9.99) + " Руб.");

        System.out.println();
        System.out.println((int) service.calculate(1_000_000, 24, 9.99) + " Руб.");

        System.out.println();
        System.out.println((int) service.calculate(1_000_000, 36, 9.99) + " Руб.");


    }
}