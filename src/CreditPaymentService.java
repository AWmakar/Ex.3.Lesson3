public class CreditPaymentService {
    public double calculate(double i, double a1, double b1) {
        double result;
        result = (i * Math.pow(a1, b1) / (Math.pow(a1, b1) - 1));
        return result;
    }
}
