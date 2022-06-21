public class Main {
    public static void main(String[] args) {
        int balance = 100; //текущий баланс
        int payment = 2350; //сумма платежа
        int priceOneBonus = 100; // шаг для начисления бонуса (рублей)

        if (payment > 1000) {
            int bonus = (payment / priceOneBonus);
            System.out.println("Начислено ,бонусов:" + bonus);
            System.out.println("Ваш баланс:" + (balance + payment + bonus));
        } else {
            int bonus = 0;
            System.out.println("Начислено ,бонусов:" + bonus);
            System.out.println("Ваш баланс:" + (balance + payment + bonus));
        }


    }
}
