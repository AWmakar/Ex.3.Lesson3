
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000; // Сумма кредита ;
        double persentRate = (9.99 / 12 / 100); // Месячная процентная ставка ;
        double monthsToPay = 12; // Количество месяцев, в течение которых выплачивается кредит ;
        double variables = (1 + persentRate);
        double coefficient = service.calculate(persentRate, variables, monthsToPay);
        int pay = (int) (coefficient * credit);

        System.out.println(pay + " рублей ежемесячный платеж по кредиту");
    }
}