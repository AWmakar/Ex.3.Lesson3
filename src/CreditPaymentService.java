public class CreditPaymentService {
    public double calculate(double persentRate, double x, double monthsToPay) {
        double result;
        result = (persentRate * Math.pow(x, monthsToPay) / (Math.pow(x, monthsToPay) - 1));
        return result;
    }
}
