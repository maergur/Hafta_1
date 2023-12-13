import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Formül : (𝜋 * (r*r) * 𝛼) / 360

        int r;
        int a;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = inp.nextInt();
        System.out.print("Dairenin merkez açısını giriniz: ");
        a = inp.nextInt();

        double dilim_alan = (pi *(r*r) * a ) / 360;

        System.out.println("Daire diliminin alanı : " + dilim_alan);
    }
}