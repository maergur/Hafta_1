import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword, select;

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan kullanıcı ve şifre bilgilerini istiyoruz.

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        /* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını soruyoruz,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
        unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
        "Şifre oluşturulamadı, lütfen başka şifre giriniz."
        sorun yoksa "Şifre oluşturuldu" yazdırıyoruz. */

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız!");
        }

         /* Şifrenin doğru olmadığı durumda şifrenin yanlış olduğunu iletip,
        sıfırlayıp isteyip istemediğini soruyoruz. */

        else if (!password.equals("java123")) {
            System.out.print("Şifreniz yanlış\nŞifrenizi sıfırlamak ister misiniz?\nSıfırlamak için Evet yazın: ");

            select = inp.nextLine();

            // Şifre sıfırlama işlemine devam etmek için kullanıcıya Evet yazdırıyoruz.

            if  (select.equals("Evet")) {

                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = inp.nextLine();

                // Eğer şifre aynı ise "Şifre oluşturulamadı..." farklı ise "Yeni şifre..." yazdırıyoruz.

                if (newPassword.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
                }
                else
                    System.out.print("Yeni şifreniz oluşturuldu.");
            }
            else System.out.print("Yeni şifre oluşturma işlemi iptal edildi.");
        }
        else {
            System.out.print("Bilgileriniz yanlış!");
        }
    }
}