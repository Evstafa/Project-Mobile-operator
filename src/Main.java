public class Main {
    public static void main(String[] args) {
        int score = 100; // Начальный счет
        int amount = 2000; // Сумма пополнения
        int bonus;


        if (amount > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        bonus = (int) (amount / 100 * bonus);
        score = amount + bonus + score;

        System.out.println("Итоговый счёт: " + score + " руб.");
        System.out.println("Начисление бонусов: " + bonus + " руб.");
    }
}
