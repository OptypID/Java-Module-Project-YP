import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int people = 0;
        while (people < 2) {
            System.out.println("На скольких человек необходимо разделить счёт?");
            Scanner scanner = new Scanner(System.in);
            try {
                people = scanner.nextInt();
                if (people < 2) {
                    System.out.println("Ошибка: неверное значение. Попробуйте снова");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка: неверное значение. Попробуйте снова");
            }
        }
        Calculator.calculate(people);
    }
}