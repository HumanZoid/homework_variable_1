public class Main {
    public static void main(String[] args) {
        //        System.out.println("Hello world!");
//      Задание 1
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775806L;
        float rockWeight = 3.4f;
        double creamWeight = 9845413213.654;
        char cpesCimbol = 36;
        boolean Box = a > 100;
        System.out.println("Знак из таблицы ASII - " + cpesCimbol);
//        Задание 2
        float firstBoxer = 78.2F; // вес первого боксера
        float twoBoxer = 82.7F; // вес второго боксера
        float totalWeight = firstBoxer + twoBoxer;
        float differentWeight = firstBoxer - twoBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + "кг!" );
        System.out.println("Разница между весами боксеров" + differentWeight + " кг!");
//        Задание 3
        short bananasUnits = 5; // количество бананов в штуках
        short milkUnits = 200;  // обьем молока в мл
        short iceCreamUnits = 2;  // количество пломбира в порциях
        short eggUnits = 4;   // количество яиц в штуках
        int bananasWeight = bananasUnits * 80; // масса продуктов в граммах
        int milkWeight = (milkUnits/100)*105;
        int eggWeight = eggUnits * 70;
        int iceCreamWeight = iceCreamUnits * 100; // масса продуктоввграммах
        int breakfestWeight = bananasWeight + milkWeight + eggWeight + iceCreamWeight; // масса завтрака в граммах
        float breakfestWeightKg = breakfestWeight / 1000F;
        System.out.println("Общий вес завтрака " + breakfestWeight + " граммов или "+ breakfestWeightKg + " килограмм!");
//        Задание 4
        int totalWeightLost = 7; // заплапнированная потеря веса в кг
        int totalWeightLostGr = totalWeightLost * 1000;
        short dayWeightLost250 = 250; // запланированная потеря веса в день 250 граммов
        short dayWeightLost500 = 500; // запланированная потеря веса в день 500 граммов
        int dayTotal250 = totalWeightLostGr / dayWeightLost250;
        int dayTotal500 = totalWeightLostGr / dayWeightLost500;
        System.out.println("Количество дней " + dayTotal250 + " , чтобы сбросить "+ totalWeightLost + " кг," +
                " при потере каждый день по " + dayWeightLost250 + " грамм" );
        System.out.println("Количество дней " + dayTotal500 + " , чтобы сбросить "+ totalWeightLost + " кг, " +
                "при потере каждый день по " + dayWeightLost500 + " грамм" );
//        Задание 5
        int machaSalaryBegin = 67_760; // зарплата до повышения
        int denisSalaryBegin = 83_690;
        int kristinaSalaryBegin = 76_230;
//        byte mashaTimeWorkYear = 3; // количество отработанных лет Маши
//        byte denisTimeWorkYear = 3; // количество отработанных лет Дениса
//        byte kristinaTimeWorkYear = 3; // количество отработанных лет Кристины
        float mashaSalaryPrize = machaSalaryBegin * 0.1F; // премия Маши 10%
        float denisSalaryPrize = denisSalaryBegin * 0.1F; // премия Дениса 10%
        float kristinaSalaryPrize = kristinaSalaryBegin * 0.1F; // премия Кристины 10%
        float mashaSalaryTotalMonth = machaSalaryBegin + mashaSalaryPrize; // зарплата Маши в месяц, после повышения на 10%
        float deniseSalaryTotalMonth = denisSalaryBegin + denisSalaryPrize; // зарплата Дениса в месяц, после повышения на 10%
        float kristinaSalaryTotalMonth = kristinaSalaryBegin + kristinaSalaryPrize; // зарплата Кристины в месяц, после повышения на 10%
        float mashaPrizeYear = mashaSalaryPrize * 12;
        float denisePrizeYear = denisSalaryPrize * 12;
        float kristinaPrizeYear = kristinaSalaryPrize *12;
        System.out.println("Маша теперь получает " + mashaSalaryTotalMonth + " рублей в месяц. Премия в месяц " + mashaSalaryPrize +
                " рублей. Годовой доход вырос на " + mashaPrizeYear + " рублей.");
        System.out.println("Денис теперь получает " + deniseSalaryTotalMonth + " рублей в месяц. Премия в месяц " + denisSalaryPrize +
                " рублей. Годовой доход вырос на " + denisePrizeYear + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalaryTotalMonth + " рублей в месяц. Премия в месяц " + kristinaSalaryPrize +
                " рублей. Годовой доход вырос на " + kristinaPrizeYear + " рублей.");

    }
}