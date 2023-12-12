import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri tanımlıyoruz.

        double kenar_a, kenar_b, kenar_c, alan, u;

        /*
        Formül

        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

        Scanner inp = new Scanner(System.in);

        System.out.print("İlk kenar uzunluğunu giriniz: ");

        kenar_a = inp.nextFloat();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");

        kenar_b = inp.nextFloat();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");

        kenar_c = inp.nextFloat();

        u = (kenar_a + kenar_b + kenar_c) / 2 ;

        alan = Math.sqrt((u * (u - kenar_a) * (u - kenar_b) * (u-kenar_c)));

        System.out.println("Üçgeninizin alanı: " + alan);
    }
}