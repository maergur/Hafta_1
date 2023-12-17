import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        double result = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");
        n = inp.nextInt();

        for(double i = 1; i <= n; i++){
            result += (1/i);
        }

        System.out.println(result);
    }
}