import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan bir sayı istiyoruz.

        System.out.print("Lütfen bir sayı giriniz: ");
        int num = inp.nextInt();

        // Basamak sayılarının toplamını hesaplıyoruz.

        int total = 0;
        int remainder;

        while (num > 0) {
            remainder = num % 10;  // Sayının birler basamağındaki rakamı alınır.
            total += remainder;    // Toplama eklenir.
            num /= 10;         // Sayının birler basamağındaki rakam çıkartılır.
        }

        // Sonucu ekrana yazdırıyoruz.

        System.out.println ("Basamak sayılarının toplamı: " + total);

    }
}