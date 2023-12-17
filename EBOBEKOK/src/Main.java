import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // EKOK = (n1 * n2) / EBOB

        int n1, n2, ebob = 1, ekok;
        Scanner inp = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        n1 = inp.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        n2 = inp.nextInt();

        // EBOB hesapla
        int k = n1;
        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("EBOB: " + k);
                break;
            }
            k--;
        }

        // EKOK hesapla
        int i = 1;
        while (i <= n1 * n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                break;
            }
            i++;
        }

        ekok = (n1 * n2) / ebob;

        System.out.println("EKOK: " + ekok);

    }
}