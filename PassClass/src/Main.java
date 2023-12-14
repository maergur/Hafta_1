import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişenkleri ve katsayıları tanımlıyoruz.

        int mat, fizik, turkce, kimya, muzik;
        int ma = 1, f = 1, t = 1, k = 1, mu = 1;

        Scanner inp = new Scanner(System.in);

        /* Kullanıcıdan notlarını alıyoruz.
         Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmıyor.

          Eğer 0 veya 100 aralığında bir not girilmez ise katsayı 1'den 0'a çekilerek
          ortalamaya dahil edilmiyor. */

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100) ma = 0;

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100) f = 0;

        System.out.print("Turkce notunuz: ");
        turkce = inp.nextInt();
        if (turkce < 0 || turkce > 100) t = 0;

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100) k = 0;

        System.out.print("Muzik notunuz: ");
        muzik = inp.nextInt();
        if (muzik < 0 || muzik > 100) mu = 0;

        double average = (mat * ma + fizik * f + turkce * t + kimya * k + muzik * mu) / (ma+f+t+k+mu);

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere.");}
        else
            { System.out.println("Tebrikler sınıfı geçtiniz.");}

        System.out.println("Not ortalamanız: " + average);}
    }