public class Main {
    public static void main(String[] args) {
        int balance = 100; //текущий баланс
        int payment = 2350; //сумма платежа
        int x = 100; // шаг для начисления бонуса (рублей)

        if (payment > 1000) {
            int bonus = (payment / x);
            System.out.println("Начислено ,бонусов:" + bonus);
            System.out.println("Ваш баланс:" + (balance + payment + bonus));
        }
        else {
            int bonus = 0;
            System.out.println("Начислено ,бонусов:" + bonus);
            System.out.println("Ваш баланс:" + (balance + payment + bonus));
        }


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
