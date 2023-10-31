import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int vet[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Inserire 5 valori: ");
            vet[i] = sc.nextInt();
        }

        for(int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}
