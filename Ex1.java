import java.util.Scanner;
public class Exercise5 {
    public static void main(String [] args) {
        System.out.println("Введите бинарный код: ");
        Scanner str = new Scanner(System.in);
        int n =str.nextInt();
        int a = 0;
        int b = 0;
        int c = n;
        for (int i = 10; i != 0; i *= 10 ) {
            if ( (n % i) / (i / 10) == 1) {
                a += Math.pow(2, b);
            }
            c /= 10;
            if (c == 0) {
                i = 0;
            }
            b += 1;
        }
        System.out.println("Число в 10 с.с. : " + a);

    }
}
