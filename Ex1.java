import java.util.Scanner;
public class Exercise5 {
    public static void main(String [] args) {
        System.out.println("Введите бинарный код: ");
        Scanner str = new Scanner(System.in);
        String s=str.nextLine();
        System.out.println("Бинарное число "+s+" в десятичной записи: "+ Integer.valueOf(s,2));
    }
}
