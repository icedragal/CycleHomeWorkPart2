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

        //Task 1.2
        System.out.println("Задание 1.2");
        i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.print(" ");

        //Task 1.3
        System.out.println("Задание 1.3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int populationGrowth = (birthRate - mortalityRate) * 12_000_000 / 1_000;
        for (i = 1; i <= 10; i++) {
            population = population + populationGrowth;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        //Task 2.1
        System.out.println("Задание 2.1");
        //monthlyFee = 15_000;
        //Инициализирована в задании 1.1
        i = 1;
        total = 0;
        while (total < 12_000_000) {
            total = total + total / 100 * 7;
            total = total + monthlyFee;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i++;
        }

        //Task 2.2
        System.out.println("Задание 2.2");
        //monthlyFee = 15_000;
        //Инициализирована в задании 1.1
        total = 0;
        i = 1;
        while (total < 12_000_000) {
            total = total + total / 100 * 7;
            total = total + monthlyFee;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
            i++;
        }

        //Task 2.3
        System.out.println("Задание 2.3");
        //monthlyFee = 15_000;
        //Инициализирована в задании 1.1
        i = 1;
        total = 0;
        int accumulationPeriod = 9 * 12;
        while (i <= accumulationPeriod) {
            total = total + total / 100 * 7;
            total = total + monthlyFee;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
            i++;
        }

        //Task 2.4
        System.out.println("Задание 2.4");
        int numberFirstFriday = 4;
        while (numberFirstFriday <= 30) { //30 для ноября
            System.out.println("Сегодня пятница, " + numberFirstFriday + "-е число. Необходимо подготовить отчет.");
            numberFirstFriday +=7;
        }

        //Task 3.1
        System.out.println("Задание 3.1");
        int thisYear = 2022;
        int startYear = thisYear - 200;
        int finishYear = thisYear + 100;
        int cometPeriod = 79;
        while (startYear <= finishYear) {
            if (startYear % cometPeriod == 0) {
                System.out.println(startYear);
            }
            startYear +=1;
        }
    }
}