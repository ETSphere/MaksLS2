import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите делимое: ");
            int dividend = scanner.nextInt();
            System.out.print("Введите делитель: ");
            int divisor = scanner.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("Деление на ноль невозможно");
            }

            new DivisionAlgorithm(dividend, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
