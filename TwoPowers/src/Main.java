import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = inp.nextInt();

        for (int k = 1, i = 1, j = 1 ; i <= n || j <= n; k++) {
            if (i <= n) {
                System.out.println(i);
                i *= 4;
            }
            if (j <= n && j != i) {
                System.out.println(j);
                j *= 5;
            }
        }
    }
}