import java.util.Scanner;
public class Exercise14 {
    public static void main (String [] args) {
        System.out.println("Введите 5 элементов массива: ");
        int[] chis = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            chis[i] = s.nextInt();
        }
        for (int i = 0; i<5; i++) {
            for (int j = 0; j < 4; j++) {
                if (chis[j] > chis[j + 1]) {
                    int b = chis[j];
                    int m = chis[j + 1];
                    chis[j] = m;
                    chis[j + 1] = b;
                }
            }
        }
        System.out.println(chis[0]+" "+ chis[1]+" "+chis[2]+" "+chis[3]+" "+chis[4]);

    }
}
