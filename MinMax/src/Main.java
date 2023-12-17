import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Kaç tane sayı gireceğimizi kullanıcıdan istiyoruz.

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = inp.nextInt();

        // İlk sayıyı kullanıcıdan istiyoruz.

        System.out.print("1. sayıyı giriniz: ");
        int number = inp.nextInt();
        int min = number;
        int max = number;

        // Diğer sayıları kontrol ediyoruz.

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = inp.nextInt();

            // En küçük sayıyı kontrol ediyoruz.

            if (number < min) {
                min = number;
            }

            // En büyük sayıyı kontrol ediyoruz.

            if (number > max) {
                max = number;
            }
        }

        // Sonuçları ekrana yazdırıyoruz.

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}