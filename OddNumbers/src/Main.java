import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
        kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
        ekrana basan programı yazıyoruz.
         */

        int n;
        double total = 0, counter = 0, avgTotal;
        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz: ");
            n = inp.nextInt();
            if (n % 4 == 0) {
                total += n;
                counter++;
            }
        } while (n % 2 ==0);

        avgTotal = total / counter;
        System.out.println("Toplam: " + avgTotal);
    }
}