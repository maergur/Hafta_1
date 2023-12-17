import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int fibNum;
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan Fibonacci serisi için sayı istiyoruz.

        System.out.print("Fibonacci serisinde kaç sayı olsun? ");
        fibNum = inp.nextInt();

        System.out.println("Fibonacci Serisi:");

        int a = 0, b = 1;

        for (int i = 0; i < fibNum; i++) {

            System.out.print(a + " ");

            // Fibonacci algoritmasını burada tanımlıyoruz

            int c = a + b;
            a = b;
            b = c;
        }
    }
}