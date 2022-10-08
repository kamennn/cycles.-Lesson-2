public class Main {
    public static void main(String[] args) {
        //задача первая//
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
        for (int c = 1; c <= 10; c++ ) {
            population += birthRate;
            population -= deathRate;
            System.out.println("Год " + c + " численность " + population);
        }
        //Домашнее задание -2 задача первая//

        }
}