import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenler tanımlandı.
        double kg, m, vke;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kg = inp.nextDouble();

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        m = inp.nextDouble();

        // Formül = Kilo (kg) / Boy(m) * Boy(m)

        vke = kg / (m*m);
        System.out.println("Vücut kitle endeksiniz: " + vke);

    }
}