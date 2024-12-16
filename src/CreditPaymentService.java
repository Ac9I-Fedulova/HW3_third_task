public class CreditPaymentService {

    public double calculate(double amount, double period, double interestRate) {

        double interestRateMonth = interestRate / 100 / 12; // месячная процентная ставка
        double x = 1 + interestRateMonth;
        double coefficient = interestRateMonth * (Math.pow(x, period)) / ((Math.pow(x, period)) - 1);
        return amount * coefficient;
    }
}
