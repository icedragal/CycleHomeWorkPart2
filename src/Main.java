public class Main {
    public static void main(String[] args) {

        //Task 1.1
        System.out.println("Задание 1.1");
        int monthlyFee = 15_000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + monthlyFee;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i++;
        }
    }
}