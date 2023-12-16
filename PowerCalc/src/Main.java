import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, k, total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = inp.nextInt();

        System.out.print("Üs olacak sayıyı giriniz: ");
        k = inp.nextInt();

        // 2^4 = 2 * 2 * 2 * 2

        for (int i = 1; i <= k; i++) {
            total *= n;
        }

        System.out.print("Sonuç: " + total);
    }
}