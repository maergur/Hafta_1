import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int integer;
        double decimal;

        Scanner inp = new Scanner (System.in);

        System.out.print("Lütfen bir tam sayı giriniz: ");
        integer = inp.nextInt();

        System.out.print("Lütfen bir ondalık giriniz: ");
        decimal = inp.nextDouble();

        double castedInteger = (double) integer;
        System.out.println("Dönüşen tam sayı yazınız: " +castedInteger);

        int castedDouble = (int) decimal;
        System.out.println("Dönüşen ondalık yazınız: " + castedDouble);

    }
}