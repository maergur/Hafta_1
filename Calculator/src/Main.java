import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan sayıları alıyoruz.

        System.out.print("İlk sayıyı giriniz: ");
        n1 = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = inp.nextInt();

        // Kullanıcan yapmak istediği işlemi seçmesini istiyoruz.

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = inp.nextInt();

        // Switch case yapısı ile seçilen işleme göre işlemi uyguluyoruz.

        switch (select) {

            case 1:
                System.out.print("Toplama: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma: " + (n1 * n2));
                break;
            case 4:

                // Sadece switch-case kullanmamız gerektiği için burada tekrar kullandım.

                switch (n2) {
                    case (0):
                        System.out.print("Bir sayı 0'a bölünemez.");
                        break;
                    default:
                        System.out.print("Bölme: " + (n1 / n2));
                }
                break;
            default:
                System.out.print("Yanlış seçim yaptınız. Lütfen tekrar deneyiniz.");

        }
    }
}