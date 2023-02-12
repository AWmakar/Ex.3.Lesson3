
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000; // Сумма кредита ;
        double persentRate = (9.99 / 12 / 100); // Месячная процентная ставка ;
        double monthsPay = 36; // Количество месяцев, в течение которых выплачивается кредит ;
        double x = (1 + persentRate);
        double K = service.calculate(persentRate, x, monthsPay);
        int A = (int) (K * credit);

        System.out.println(A + " рублей ежемесячный платеж по кредиту");
    }
}