public class MaxArray{
    public static void main(String[] args) {
        int[] numeri = {12, 45, 78, 23, 56, 89, 34, 65, 20, 43};

        int max = numeri[0];
        
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }

        System.out.println("Il numero più grande è: " + max);
    }
}