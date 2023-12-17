import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num, total = 0;
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı girişi istiyoruz.

        System.out.print("Bir sayı giriniz: ");
        num = scanner.nextInt();

        /* Bir sayının kendisi hariç pozitif tam sayı
           çarpanları (kalansız bölen sayıların) toplamı kendisine
           eşit olan sayıya mükemmel sayı denir. */

        if (num > 0) {
            // Sayının kendisine kadar olan tüm bölenlerini kontrol ediyoruz.

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    total += i;
                }
            }

            // Kalansız bölen sayıların toplamı eğer girilen sayıya eşit mi değil mi
            // kontrolü yapıyoruz.

            if (total == num) {
                System.out.println(num + " mükemmel sayıdır.");
            } else {
                System.out.println(num + " mükemmel sayı değildir.");
            }
        }
        // Eğer pozitif sayı girilmediyse tekrardan giriş istiyoruz.
        else {
            System.out.println("Lütfen pozitif bir sayı girin.");
        }

    }
}