import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan istenilen verileri tanımlıyoruz.

        int km, age, flightType, ticketAmt = 1;
        double kmCost = 0.1, total, ageDc = 1, flightTypeDc = 1;

        /* Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/


        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen mesafe bilgisini giriniz: ");
        km = inp.nextInt();

        System.out.print("Lütfen yaş bilgisini giriniz: ");
        age = inp.nextInt();

        System.out.print("Tek Yön? Gidiş-Dönüş? 1 veya 2 yazarak seçim yapın: ");
        flightType = inp.nextInt();

        // Mesafe tutarını hesaplıyoruz ve yaşa göre indirim için koşulları yazıyoruz.

        if (km > 0 && age > 0){

            if (flightType == 1){
                if(age < 12){
                    ageDc = 0.5;
                } else if (age > 12 && age < 24) {
                    ageDc = 0.9;
                } else if (age > 65) {
                    ageDc = 0.7;
                }
            }

            else if (flightType == 2) {
                flightTypeDc = 0.8;
                ticketAmt = 2;
                if(age < 12){
                    ageDc = 0.5;
                } else if (age > 12 && age < 24) {
                    ageDc = 0.9;
                } else if (age > 65) {
                    ageDc = 0.7;
                }
            }

            total = km * kmCost * ageDc * flightTypeDc * ticketAmt;
            System.out.print("Bilet ücretiniz: " + total + " TL");
        }


        else {
            System.out.print("Hatalı Veri Girdiniz!");
        }

    }
}