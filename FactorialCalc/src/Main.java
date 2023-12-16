import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // C(n,r) = n! / (r! * (n-r)!)

        int comb, n, r, diffRN;

        int totalN = 1, totalR = 1, totalRN = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kümenin eleman sayısını giriniz: ");
        n = inp.nextInt();

        System.out.print("Lütfen kombinasyon yapmak istediğiniz sayıyı giriniz: ");
        r = inp.nextInt();

        diffRN = n - r;

        for (int i = 1; i <= n; i ++) {
            totalN = totalN * i;
        }

        for (int j = 1; j <= r; j ++) {
            totalR = totalR * j;
        }

        for (int k = 1; k <= diffRN; k ++) {
            totalRN = totalRN * k;
        }

        comb = totalN / (totalR * totalRN);
        System.out.println(diffRN);
        System.out.println(totalN);
        System.out.println(totalR);
        System.out.println(totalRN);
        System.out.println("Kombinasyon sonucu: " + comb);
    }
}