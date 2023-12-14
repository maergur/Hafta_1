import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz: ");

           /* Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */

       heat = inp.nextInt();

       // If-else yerine ternary operatörü kullanıyoruz

       int activity = (heat < 5) ? 1 :( heat < 15 ) ? 2 : (heat < 25)? 3 : 4;

       // Ternary operatöründen gelen çıktıya göre switch-case yapısı ile çıktımızı alıyoruz.

        switch (activity) {

            case 1:
                System.out.println("Kayağa gidebilirsiniz.");
                break;

            case 2:
                System.out.println("Sinemaya gidebilirsiniz.");
                break;

            case 3:
                System.out.println("Pikniğe gidebilirsiniz.");
                break;

            case 4:
                System.out.println("Yüzmeye gidebilirsiniz.");
                break;
        }
    }

}