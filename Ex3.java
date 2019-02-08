import java.util.Scanner;
public class Serova1 {
    public static void main (String[] args) {
        Scanner does = new Scanner(System.in);
        System.out.println("Введите курс доллара к рублю: ");
        double kurs = does.nextDouble();
        System.out.println("Введите сумму в рублях: ");
        double sum = does.nextDouble();
        System.out.println(sum + " рублей это "+ sum/kurs+ " долларов.");
    }
}
