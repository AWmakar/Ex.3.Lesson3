public class CreditPaymentService {
    public double calculate(double persentRate, double variables, double monthsToPay) {
        double result;
        result = (persentRate * Math.pow(variables, monthsToPay) / (Math.pow(variables, monthsToPay) - 1));
        return result;
    }
}
