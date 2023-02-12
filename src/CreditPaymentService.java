public class CreditPaymentService {
    public double calculate(double persentRate, double x, double monthsPay) {
        double result;
        result = (persentRate * Math.pow(x, monthsPay) / (Math.pow(x, monthsPay) - 1));
        return result;
    }
}
