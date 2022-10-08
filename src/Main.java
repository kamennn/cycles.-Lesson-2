public class Main {
    public static void main(String[] args) {
        //задача первая
        double accumulationWithPercent = 0;
        double accumulation = 15000;
        double Percent = 0.05;
        int i = 1;
        while (accumulationWithPercent < 2_459_000 + i++) {
            accumulationWithPercent = (accumulationWithPercent + accumulation) * (1 + Percent);
            System.out.println("За " + i + " Месяцев сумма накоплений равна " + accumulationWithPercent + " рублей");
        }
        //задача вторая//
        int a = 1;
        while (a <= 10) {
            System.out.println(a++);
        }
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        //задача третья//
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        for (int c = 1; c <= 10; c++) {
            population += birthRate;
            population -= deathRate;
            System.out.println("Год " + c + " численность " + population);
        }
        //Домашнее задание -2 задача первая//
        int initialAmount = 15000;
        int i1 = 1;
        while (initialAmount <= 12_000_000 + i1++) {
            initialAmount *= 1.07;
            System.out.println("За " + i1 + " Месяцев сумма накоплений равна " + initialAmount + " рублей");
        }
        //задача вторая//
        int initialAmount1 = 15000;
        int i2 = 1;
        while (initialAmount1 <= 12_000_000 + i2++) {
            initialAmount1 *= 1.07;
            if (i2 % 6 == 0)
                System.out.println("За " + i2 + " Месяцев сумма накоплений равна " + initialAmount1 + " рублей");
        }
        //задача третья//
        int initialAmount2 = 15000;
        for (int c1 = 1; c1 < 9 * 12; c1 += 6) {
            initialAmount2 *= 1 + 0.07 * 6;
            System.out.println("За " + c1 + " месяца сумма накоплений равна " + initialAmount2 + " рублей");
        }
        //задача четвертая//
        int friday = 1;
        for (int currentFriday = friday; currentFriday <= 31; currentFriday += 7)
            System.out.println("Сегодня пятница, " + currentFriday + " число. Необходимо подготовить отчет.");
        //Домашнее задание -3 задача первая//
        int year = 2022;
        int beginning = year - 200;
        int ending = year + 100;
        for (int n = beginning; n < ending; n++) {
            if (n % 79 == 0) {
                System.out.println(n);
            }
            //задача вторая //
        }
            for (int h = 1; h <= 10; h++) {
                System.out.println("2 * " + h + " = " + 2 * h);
            }
        }
    }