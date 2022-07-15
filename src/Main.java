public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte dog = 5;
        short cat = 1;
        int mouse = 110;
        long elephants = 200;
        float shugarWeight = 12.34f;
        double saltWeight = 34.12;
        boolean dogisAdoult = dog > 10;
        System.out.println(dogisAdoult);
        //Задание2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double Weightofallboxer = boxer1 + boxer2;
        double Weightdifferentboxer = boxer2 - boxer1;
        System.out.println(Weightofallboxer);
        System.out.println(Weightdifferentboxer);
        //Задание3
        int weightBanana = 5 * 80;
        int weightMilk = 200 / 100 * 105;
        int weightIcecrem = 2 * 100;
        int weightEgs = 4 * 70;
        int weightAllCoctel = weightBanana + weightMilk + weightIcecrem + weightEgs;
        float weightinKg = weightAllCoctel / 1000f;
        System.out.println(weightinKg);
        //Задание4
        int daysforlostweight = 7000 / 250;
        int daysforlostweight2 = 7000 / 500;
        System.out.println("При потере 250г в день" + daysforlostweight);
        System.out.println("При потере 500г в день" + daysforlostweight2);
        int daysmidllost = (daysforlostweight + daysforlostweight2) / 2;
        System.out.println(daysmidllost);
        //Задание5
        float salaryyersMasha = 67760 * 12 * 1.1f;
        float salaryyersDen = 83690 * 12 * 1.1f;
        float salaryyersKris =  76230 * 12 * 1.1f;
        System.out.println("Zarpla za god Mashi new " + salaryyersMasha);
        System.out.println("Zarpla za god Den new " + salaryyersDen);
        System.out.println("Zarpla za god Kris new  " + salaryyersKris);
        int salaryyersMashaold = 67760 * 12;
        int salaryyersDenold = 83690 * 12;
        int salaryyersKrisold =  76230 * 12;
        System.out.println("Zarpla za god Mashi old " + salaryyersMashaold);
        System.out.println("Zarpla za god Den old " + salaryyersDenold);
        System.out.println("Zarpla za god Kris old  " + salaryyersKrisold);
        int differentsalaryMasha = (int) (salaryyersMasha - salaryyersMashaold);
        int differentsalaryDen = (int) (salaryyersDen - salaryyersDenold);
        int differentsalaryKris = (int) (salaryyersKris - salaryyersKrisold);
        System.out.println("Dohod Mashi viros na " + differentsalaryMasha);
        System.out.println("Dohod Den viros na " + differentsalaryDen);
        System.out.println("Dohod Kris viros na " + differentsalaryKris);





    }
}