import java.io.OptionalDataException;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Привет, Мир!");
            var dog = 8.0;
            System.out.println(dog);
            var cat = 3.6;
            System.out.println(cat);
            var paper = 763789;
            System.out.println(paper);
            var result12 = (dog + 4);
            System.out.println(result12);
            var result13 = (cat + 4);
            System.out.println(result13);
            var result17 = (paper + 4);
            System.out.println(result17);
            var result15 = (12 - 3.5);
            System.out.println(result15);
            var result = (7.6 - 1.6);
            System.out.println(result);
            var result16 = (763793 - 7639);
            System.out.println(result16);
            var friend = 19;
            System.out.println(friend);
            var result1 = (friend + 2);
            System.out.println(result1);
            var result3 = (17 / 7);
            System.out.println(result3);
            var frog = 3.5;
            System.out.println(frog);
            var result2 = (frog * 10);
            System.out.println(result2);
            var result4 = (result2 / 3.5);
            System.out.println(result4);
            var fighter_a = 78.2;
            var fighter_b = 82.7;
            var result5 = (fighter_a + fighter_b);
            System.out.println(result5 + "общий вес бойцов");
            var result6 = (fighter_b - fighter_a);
            System.out.println(result6 + "разница веса бойцов");
            var result7 = (fighter_a % fighter_b);
            System.out.println(result7 + "составляет разница в делении");
            var result8 = (640 / 8);
            System.out.println("всего работников в компании-" + result8 + "-человек");
            var result9 = (80 + 94);
            var result10 = (8 * 94);
            System.out.println("Если в компании работает-" + result9 + "-человека, то всего-" + (result10 + 640) + "-часа работы может быть поделено между сотрудниками)");
            byte a = -10;
            System.out.println("значение переменной а с типом byte равно -10");
            short b = 16546;
            System.out.println("значение переменной b с типом short равно 16546");
            int c = 425659546;
            System.out.println("значение переменной c с типом int равно 425659546");
            long d = 1654214581;
            System.out.println("значение переменной d с типом long равно 1654214581");
            float e = 3.75f;
            System.out.println("значение переменной e с типом float равно 3.75f");
            double k = 1.7E+308;
            System.out.println("значение переменной k с типом double равно 1.7E+308");
            char h = 582;
            boolean r = true;
            double D = 27.12;
            long K = 987678965549L;
            double t = 2.786;
            short A = 569;
            short B = -159;
            short T = 27897;
            byte Y = 67;
            int studentPack =(23+27+30);
            System.out.println(studentPack);
            int paperConsuption=(480/studentPack);
            System.out.println("На каждого ученика рассчитано_"+paperConsuption+"_листов бумаги");
            byte machinePerfomance=(16/2);
            System.out.println("производительность машины для изготовления бутылок в минуту составляет_"+machinePerfomance);
            short machinePerfomance_20=(short)(machinePerfomance*20);
            short machinePerfomance_24hours=(short)(machinePerfomance*60*24);
            int machinePerfomance_3days=(machinePerfomance*machinePerfomance_24hours*3);
            int machinePerfomance_1month=(machinePerfomance*machinePerfomance_3days*10);
            System.out.println("производительность машины для изготовления бутылок за 20 минут составит_"+machinePerfomance_20);
            System.out.println("производительность машины для изготовления бутылок за 24 часа составит_"+machinePerfomance_24hours);
            System.out.println("производительность машины для изготовления бутылок за три дня составит_"+machinePerfomance_3days);
            System.out.println("производительность машины для изготовления бутылок за месяц составит_"+machinePerfomance_1month);
            byte numberClasses=(120/(4+2));
            System.out.println(numberClasses);
            byte buyBrownPaint=(20*4);
            byte buyWhitePaint=(20*2);
            System.out.println("В школе, где_"+numberClasses+"_классов, нужно_"+buyWhitePaint+"_банок белой краски и_"+buyBrownPaint+"_банок коричневой краски");
            short banana5=(5*80);
            short milk200=(2*105);
            short iceCream2=(2*100);
            short chikenEgss4=(4*70);
            float breakfastSport=(banana5+milk200+iceCream2+chikenEgss4);
            System.out.println("вес спортзавтрака составляет_"+breakfastSport+"_грамм");;
            System.out.printf("вес спортзавтрака составляет_"+(breakfastSport/1000)+"_кг");;
            var weightLoss1=(7000/250);
            var weightLoss2=(7000/500);
            var weightLoss3=((weightLoss1+weightLoss2)/2);
            System.out.println("при похудении на 250 грамм/день, понадобится_"+weightLoss1+"_дней");
            System.out.println("при похудении на 500 грамм/день, понадобится_"+weightLoss2+"_дней");
            System.out.println("при похудении на 7кг. в среднем понадобится_"+weightLoss3+"_день");
            var masha1MonthUp=((67760./100)*110);
            var denis1MonthUp=((83690./100)*110);
            var kristina1MonthUp=((76230./100)*110);
            var masha1YearUp=(masha1MonthUp*12);
            var denis1YearUp=(denis1MonthUp*12);
            var kristina1YearUp=(kristina1MonthUp*12);
            var masha1Year=(67760*12);
            var denis1Year=(83690*12);
            var kristina1Year=(76230*12);
            var mashaDiff=(masha1YearUp-masha1Year);
            var denisDiff=(denis1YearUp-denis1Year);
            var kristinaDiff=(kristina1YearUp-kristina1Year);
            System.out.println("Маша теперь получает_"+masha1YearUp+"_рублей. Годовой доход вырос на_"+mashaDiff+"_рублей");
            System.out.println("Денис теперь получает_"+denis1YearUp+"_рублей. Годовой доход вырос на_"+denisDiff+"_рублей");
            System.out.println("Кристина теперь получает_"+kristina1YearUp+"_рублей. Годовой доход вырос на_"+kristinaDiff+"_рублей");



































        }}

    private static class r {
    }
}



