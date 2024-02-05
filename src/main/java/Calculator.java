import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    static void calculate(int people) {
        String prod = "";
        double price = 0.0;

        while (true) {
            System.out.println("Для добавления позиции, Введите название" +
                    "\nДля завершения подсчёта, Введите 'Завершить'");
            Scanner scanner = new Scanner(System.in);
            String inputProd = scanner.next();

            if (inputProd.equalsIgnoreCase("Завершить")) {
                break;
            } else {
                prod = prod + inputProd + "\n";
                price = price + getPrice();
            }

        }
        System.out.println("Добавленные позиции:\n" + prod);
        double result = price / people;
        String temp = "Каждый человек должен заплатить %.2f" + Formatter.formatted((int) Math.floor(result));
        System.out.println(String.format(temp, result));
    }


    static double getPrice() {
        while (true) {
            System.out.println("Укажите стоимость в формате: 'рубли.копейки' [например: 5,55 или 11.48]");
            double inputPrice = 0;
            try {
                Scanner scanner = new Scanner(System.in);
                inputPrice = scanner.nextDouble();
                if (inputPrice <= 0){
                    System.out.println("Ошибка: неверное значение. Попробуйте снова");
                } else {
                    return inputPrice;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: неверное значение. Попробуйте снова");
            }
        }
    }

}
