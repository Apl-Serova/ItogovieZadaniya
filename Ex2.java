import java.util.Scanner;
public class Exercise14 {
    public static void main (String [] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        System.out.println("Введите " + k + " элементов массива: ");
        int[] chis = new int[k];

        for (int i = 0; i<k; i++) {
            chis[i] = s.nextInt();
        }
        for (int i = 0; i<k; i++) {
            for (int j = 0; j < (k-1); j++) {
                if (chis[j] > chis[j + 1]) {
                    int b = chis[j];
                    int m = chis[j + 1];
                    chis[j] = m;
                    chis[j + 1] = b;
                }
            }
        }
        for (int i = 0; i<k; i++) {
            System.out.println(chis[i]);
        }

    }
}
