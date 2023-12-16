import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /* Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
           1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
           100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
           Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.*/

        int year;

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan yıl girişi istiyoruz.

        System.out.print("Lütfen yıl giriniz: ");
        year = inp.nextInt();

        if (year % 4 == 0){

            if (year % 100 == 0 && year % 400 == 0) {
                System.out.println(year +" Artık bir yıldır.");
            }

            else if (year % 100 == 0 && year % 400 != 0){
                System.out.println(year +" Artık bir yıl değildir.");
            }

            else
                System.out.println(year +" Artık bir yıldır.");

        }

        else {
            System.out.println(year +"Artık bir yıl değildir.");
        }


    }
}