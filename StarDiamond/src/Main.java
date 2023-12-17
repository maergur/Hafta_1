import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        n = inp.nextInt();

        // Üst üçgen yapımı

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // Alt üçgen yapımı

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