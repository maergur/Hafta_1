import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // Scanner sınıfını tanımla

        Scanner inp = new Scanner(System.in);

        // Değişkenleri tanımlıyoruz.

        float kdv_0, kdv_18 = 1.18f, kdv_08 = 1.08f;


        System.out.print("Lütfen KDV'siz fiyatı giriniz: ");

        kdv_0 = inp.nextFloat();

        // KDV'siz tutar 1000'den küçük ise 0.18 büyükse 0.08 olarak hesaplanacak

        System.out.println("Tutar: " + kdv_0);
        System.out.println(kdv_0 > 1000f ? "KDV oranı: 0.08" : "KDV oranı: 0.18" );
        System.out.println("KDV tutarı: " + (kdv_0 > 1000f ? ((kdv_0 * kdv_08) - kdv_0): (kdv_0 * kdv_18)- kdv_0));
        System.out.println("KDV'li tutar: " + (kdv_0 > 1000f ? (kdv_0 * kdv_08) : (kdv_0 * kdv_18)));
    }
}