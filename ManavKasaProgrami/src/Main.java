import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenler tanımlandı.
        double armut = 2.14, elma = 3.67, domates = 1.11 , muz = 0.95, patlican = 5.00;
        double armut_kg, elma_kg, domates_kg, muz_kg, patlican_kg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız? ");
        armut_kg = inp.nextDouble();

        System.out.print("Kaç kilo elma aldınız? ");
        elma_kg = inp.nextDouble();

        System.out.print("Kaç kilo domates aldınız? ");
        domates_kg = inp.nextDouble();

        System.out.print("Kaç kilo muz aldınız? ");
        muz_kg = inp.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız? ");
        patlican_kg = inp.nextDouble();

        // Tutar formülü
        double total = armut * armut_kg + elma * elma_kg + domates * domates_kg + muz * muz_kg + patlican * patlican_kg;
        System.out.println("Toplam Tutar: " + total + " TL");


    }
}
