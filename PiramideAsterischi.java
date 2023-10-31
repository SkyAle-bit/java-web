import java.util.Scanner;

public class PiramideAsterischi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di righe della piramide: ");
        int righe = input.nextInt();

        for (int i = 1; i <= righe; i++) {
            for (int spazi = 1; spazi <= righe - i; spazi++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}