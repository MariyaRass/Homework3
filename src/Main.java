public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 2636;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 125;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 10267;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 1896355826L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 3.25896f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 6.98568422255;
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("Задание 2");
        float g = 27.12f;
        System.out.println(g);
        long k = 987_678_965_549L;
        System.out.println(k);
        float l = 2.786f;
        System.out.println(l);
        short p = 569;
        System.out.println(p);
        short o = -159;
        System.out.println(o);
        short u = 27897;
        System.out.println(u);
        int y = 67;
        System.out.println(y);

        System.out.println("Задание 3");
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short totalPaper = 480;
        int sheetsForEach = totalPaper / (ludmila + anna + ekaterina);
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги");

        System.out.println("Задание 4");
        byte efficiency = 16;
        byte time = 2;
        int efficiency20min = (20 / time) * efficiency;
        System.out.println("За 20 минут машина произвела " + efficiency20min + " бутылок.");
        int efficiencyOneday = ((24*60) / time) * efficiency;
        System.out.println("За сутки машина произвела " + efficiencyOneday + " бутылок.");
        int efficiencyThreeDays = (((24*3)*60) / time) * efficiency;
        System.out.println("За три дня машина произвела " + efficiencyThreeDays + " бутылок.");
        int efficiencyMonth = (((24*30)*60) / time) * efficiency;
        System.out.println("За месяц машина произвела " + efficiencyMonth + " бутылок.");

        System.out.println("Задание 5");
        byte totalCans = 120;
        byte white = 2;
        byte brown = 4;
        int class1 = white + brown;
        int totalClasses = totalCans / class1;
        int totalWhite = totalClasses * white;
        int totalBrow = totalClasses * brown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrow + " банок коричневой краски.");

        System.out.println("Задание 6");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int egg = 4*70;
        int breakfastWeight = banana + milk + iceCream + egg;
        float weightInKilograms = breakfastWeight / 1000f;
        System.out.println("Вес спортзавтрака " + weightInKilograms + " килограмм.");

        System.out.println("Задание 7");
        int itIsNecessaryToReset= 7_000;
        int minGram = 250;
        int maxGram = 500;
        float minTerm = (float) itIsNecessaryToReset / minGram;
        System.out.println("Минимальный срок " + minTerm + " дней.");
        float maxTerm = (float) itIsNecessaryToReset / maxGram;
        System.out.println("Максимальный срок " + maxTerm + " дней.");
        float averageGram = (float) (minGram + maxGram) / 2;
        float averageDays = (float) itIsNecessaryToReset / averageGram;
        System.out.println("Средний срок " + averageDays + " дней.");

        System.out.println("Задание 8");
        int mariya = 67_760;
        int mariaForTheYear = mariya * 12;
        int denis = 83_690;
        int denisForTheYear = denis * 12;
        int kristina = 76_230;
        int kristinaForTheYear = kristina * 12;
        double newMariya = mariya * 1.1;
        var incomeForTheYearNew = (newMariya * 12) - mariaForTheYear;
        System.out.println("Маша теперь получает " + newMariya + " рублей. Годовой доход вырос на " + incomeForTheYearNew + " рублей.");
        float newDenis = (float) (denis * 1.1);
        var incomeForTheYearNew2 = (newDenis * 12) - denisForTheYear;
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + incomeForTheYearNew2 + " рублей.");
        double newKristina = kristina * 1.1;
        var incomeForTheYearNew3 = (newKristina * 12) - kristinaForTheYear;
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + incomeForTheYearNew3 + " рублей.");



















    }






}