import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Doğum Tarihi %12 = 0 ➜ Maymun

           Doğum Tarihi %12 = 1 ➜ Horoz

           Doğum Tarihi %12 = 2 ➜ Köpek

           Doğum Tarihi %12 = 3 ➜ Domuz

           Doğum Tarihi %12 = 4 ➜ Fare

           Doğum Tarihi %12 = 5 ➜ Öküz

           Doğum Tarihi %12 = 6 ➜ Kaplan

           Doğum Tarihi %12 = 7 ➜ Tavşan

           Doğum Tarihi %12 = 8 ➜ Ejderha

           Doğum Tarihi %12 = 9 ➜ Yılan

           Doğum Tarihi %12 = 10 ➜ At

           Doğum Tarihi %12 = 11 ➜ Koyun */

        int date, zodiac;
        String zodiacType = "";
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan doğum tarihini istiyoruz.

        System.out.print("Lütfen doğum yılınızı giriniz: ");
        date = inp.nextInt();

        // Girilen doğum yılını mod alarak karışılık gelen Çin burcuna göre sınıflandırıyoruz.

        zodiac = date % 12;

        switch (zodiac){
            case 0:
                zodiacType = "Maymun";
                break;
            case 1:
                zodiacType = "Horoz";
                break;
            case 2:
                zodiacType = "Köpek";
                break;
            case 3:
                zodiacType = "Domuz";
                break;
            case 4:
                zodiacType = "Fare";
                break;
            case 5:
                zodiacType = "Öküz";
                break;
            case 6:
                zodiacType = "Kaplan";
                break;
            case 7:
                zodiacType = "Tavşan";
                break;
            case 8:
                zodiacType = "Ejderha";
                break;
            case 9:
                zodiacType = "Yılan";
                break;
            case 10:
                zodiacType = "At";
                break;
            case 11:
                zodiacType = "Koyun";
                break;

        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodiacType);

    }
}