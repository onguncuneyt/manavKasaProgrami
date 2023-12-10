import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double armut = 2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double armutKg ,elmaKg,domatesKg,muzKg,patlicanKg;
        double toplam;
        System.out.print("Armut kaç kilo : ");
        armutKg = inp.nextDouble();

        System.out.print("Elma kaç kilo : ");
        elmaKg = inp.nextDouble();

        System.out.print("Domates kaç kilo : ");
        domatesKg = inp.nextDouble();

        System.out.print("Muz kaç kilo : ");
        muzKg = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo : ");
        patlicanKg = inp.nextDouble();

        toplam = (armutKg*armut) + (elmaKg*elma) + (domatesKg*domates) + (muzKg*muz) + (patlicanKg*patlican);

        System.out.println("Toplam Tutar : " + Math.round(toplam*100.0) / 100.0);

    }
}