
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int S = 1_000_000; // Сумма кредита ;
        double i = (9.99 / 12 / 100); // Месячная процентная ставка ;
        double b1 = 24; // Количество месяцев, в течение которых выплачивается кредит ;
        double a1 = (1 + i);
        double K = service.calculate(i, a1, b1);
        int A = (int) (K * S);

        System.out.println(A + " рублей ежемесячный платеж по кредиту");
    }
}