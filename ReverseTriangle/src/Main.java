import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        n = inp.nextInt();

        // Yıldız elmas pratiğindeki "alt üçgen" kodunu burada direk kullanıyoruz.

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}