import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur

        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanımla

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al

        System.out.print("Matematik Notunuz: ");

        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");

        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");

        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz: ");

        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");

        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz: ");

        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = (toplam / 6.0);

        System.out.println("Ortalamanız: " + sonuc);

        // if ve else kullanamadığımız için koşul operatörü ? kullandım

        System.out.println((sonuc > 60 ? "Sınıfı geçti." : "Sınıfta kaldı."));





    }
}