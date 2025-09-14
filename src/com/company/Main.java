package com.company;

public class Main {

    public static void main(String[] args) {
	// Task 1
        int i = 0;
        byte b = 0;
        short s = 0;
        long l = 0L;
        float f = 0f;
        double d = 0d;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);


    // Task 2

        float f1 = 27.12f;
        long l1 = 987678965549L;
        short s1 = 2786;
        short s2 = 569;
        short s3 = -159;
        short s4 = 27897;
        byte b1 = 67;


    // Task 3

        byte LPStudents = 23;
        byte ASStudents = 27;
        byte EAStudents = 30;
        short totalCountOfPaperSheets = 480;
        int totalCountOfStudents = LPStudents + ASStudents + EAStudents;
        int averageCountOfSheets = totalCountOfPaperSheets / totalCountOfStudents;
        System.out.println("На каждого ученика рассчитано " + averageCountOfSheets + " листов бумаги");

    // Task 4

        byte productivityPerMinute = 8;
        int productivityPer20Minute = 20 * 8;
        int productivityPerDay = 144 * 8;
        int productivityFor3Days = productivityPerDay * 3;
        int productivityForMonth = productivityPerDay * 30;

        System.out.println("За 20 минут машина произвела " + productivityPer20Minute + " штук бутылок");
        System.out.println("За день машина произвела " + productivityPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityFor3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityForMonth + " штук бутылок");

    //Task 5

        int totalCountOfPaintCan = 120;
        int requiredNumberOfCansOfWhitePaintForOneClass = 2;
        int requiredNumberOfCansOfBrownPaintForOneClass = 4;
        int totalCountOfClasses = 120 / (requiredNumberOfCansOfBrownPaintForOneClass +
                requiredNumberOfCansOfWhitePaintForOneClass);
        int requiredNumberOfCansOfWhitePaintForAllClasses = requiredNumberOfCansOfWhitePaintForOneClass *
                totalCountOfClasses;
        int requiredNumberOfCansOfBrownPaintForAllClasses = requiredNumberOfCansOfBrownPaintForOneClass *
                totalCountOfClasses;
        System.out.println("В школе, где " + totalCountOfClasses + " классов, нужно "
                + requiredNumberOfCansOfWhitePaintForAllClasses +
                " банок белой краски и " + requiredNumberOfCansOfBrownPaintForAllClasses + " банок коричневой краски");

    //Task 6

        int countOfBananas = 5;
        int weightOfBanana = 80;
        int MilkInMl = 200;
        int milkWeightPer100Ml = 105;
        int countOfIceCreamPackages = 2;
        int iceCreamWeight = 100;
        int countOfEggs = 4;
        int weightOfOneEgg = 70;
        int grPerKg = 1000;
        int weightOfBreakfastInGrams = (countOfBananas * weightOfBanana) + ((MilkInMl / 100) * milkWeightPer100Ml) +
                (countOfIceCreamPackages * iceCreamWeight) + ( countOfEggs * weightOfOneEgg);
        float weightOfBreakfastInKg = weightOfBreakfastInGrams / (float)grPerKg;

        System.out.println("Вес завтрака " + weightOfBreakfastInGrams + " грамм");
        System.out.println("Вес завтрака " + weightOfBreakfastInKg + " килограмм");

    // Task 7

        int weightToLoseInKg = 7;
        int weightToLoseInGr = weightToLoseInKg * 1000;
        int firstDiet = 250;
        int secondDiet = 500;
        int countOfDaysWithFirstDiet = weightToLoseInGr / firstDiet;
        int countOfDaysWithSecondDiet = weightToLoseInGr / secondDiet;
        int averageDays = (countOfDaysWithFirstDiet + countOfDaysWithSecondDiet) / 2;

        System.out.println("Количество дней для похудения на первом режиме питания " + countOfDaysWithFirstDiet +
                " дней");
        System.out.println("Количество дней для похудения на втором режиме питания " + countOfDaysWithSecondDiet +
                " дней");
        System.out.println("Среднее количество дней для похудения " + averageDays);

    //Task 8

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int newMashaSalary = mashaSalary + (mashaSalary / 10);
        int newDenisSalary = denisSalary + (denisSalary / 10);
        int newKristinaSalary = kristinaSalary + (kristinaSalary / 10);
        int differenceOfMashaSalaries = (newMashaSalary * 12) - (mashaSalary * 12);
        int differenceOfDenisSalaries = (newDenisSalary * 12) - (denisSalary * 12);
        int differenceOfKristinaSalary = (newKristinaSalary * 12) - (kristinaSalary * 12);

        System.out.println("Маша теперь получает " + newMashaSalary +
                " рублей. Годовой доход вырос на " + differenceOfMashaSalaries + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary +
                " рублей. Годовой доход вырос на " + differenceOfDenisSalaries + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary +
                " рублей. Годовой доход вырос на " + differenceOfKristinaSalary + " рублей");



    }
}
