import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Verileri tanımlıyoruz.

        int k;
        double avgSum, counter = 0, sum = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 || i % 4 == 0) {

                // Kaç tane sayı çıktığını hesaplamak için counter ile takip ediyoruz.

                counter++;
                sum += i;
            }
        }

        // Toplam sayıyı counter'dan gelen sayıya bölüyoruz (ortalamayı bulmak için)

        avgSum = (sum / counter);
        System.out.println("3 ve 4'e bölünebilen sayıların ortalaması: " + avgSum);
    }
}