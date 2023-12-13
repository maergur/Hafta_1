import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenleri tanımlıyoruz.

        int a,b,c;

        // Kullanıcıdan 3 adet sayı istiyoruz.

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen 3 adet sayı giriniz.");

        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();

        // İşlem formülü --> a+b*c-b

        int formula = a + (b * c) - b;

        System.out.println("İşlem sonucunuz: " + formula);
    }
}