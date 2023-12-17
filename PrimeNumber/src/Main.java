import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;

        System.out.print("Sayı Giriniz: ");
        num = new Scanner(System.in).nextInt();
        boolean status = true;

        /* Asal sayıları 1 ve kendine bölünen sayılardır.

        Burada onu kontrol ediyoruz. Her sayı 1'e bölünür.

        Bu yüzden sadece kendisi dışında bölünüp bölünmediğini kontrol ediyoruz.
         */
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                status = false;
                break;
            }
        }

        if (status)
        {
            System.out.println(num+" Asaldır.");
        }
        else
        {
            System.out.println(num + " Asal değildir.");
        }
    }
}