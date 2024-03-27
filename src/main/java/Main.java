import java.util.InputMismatchException;
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
                throw new ArithmeticException("\u001B[0mДеление на ноль невозможно");
            }

            new DivisionAlgorithm(dividend, divisor);
        } catch (ArithmeticException e) {
            System.out.println("\u001B[31mОшибка: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\u001B[31mОшибка: \u001B[0mВводить можно только целые числа");
        }
        finally {
            scanner.close();
        }
    }
}
