import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите делимое: ");
        int dividend = scanner.nextInt();
        System.out.print("Введите делитель: ");
        int divisor = scanner.nextInt();

        DivisionCalculator.divide(dividend, divisor);
        scanner.close();
    }
}

class DivisionCalculator {
    public static String widthLine(int width) {
        String minus = "-";
        return minus.repeat(Math.max(0, width));
    }

    public static void divide(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        int remaindTransfer = 0;
        StringBuilder steps = new StringBuilder();
        int dividendWidth = String.valueOf(dividend).length();
        int quotientWidth = String.valueOf(dividend).length();
        String line = widthLine(quotientWidth);

        for (int i = 0; i < dividendWidth; i++) {
            int nextDigit = Character.getNumericValue(String.valueOf(dividend).charAt(i)) + remaindTransfer;
            int nextQuotient = nextDigit / divisor;
            remaindTransfer = (nextDigit % divisor) * 10;
            int nextMultiplicationProduct = divisor * nextQuotient;

            if (i == 0) {
                steps.append(Formatter.headStep(dividend, divisor, quotient, line, nextMultiplicationProduct));
            } else {
                steps.append(Formatter.midStep(nextDigit, nextMultiplicationProduct, i + 2));
            }
        }
        steps.append(Formatter.lastStep(remainder, dividendWidth + 1));
        System.out.print(steps);
    }
}

class Formatter {
    public static String headStep(int dividend, int divisor, int quotient, String line, int multiple) {
        String dividendStr = String.valueOf(dividend);
        String divisorStr = String.valueOf(divisor);
        String quotientStr = String.valueOf(quotient);
        String intermediateMultipleStr = String.valueOf(multiple);
        int spaceCount = dividendStr.length();
        String spaces = new String(new char[spaceCount - 1]).replace("\0", " ");

        return String.format("%s", "_" + dividendStr + "|" + divisorStr) + System.lineSeparator() +
                String.format("%s%" + spaceCount + "s", " " + intermediateMultipleStr, "|") + line + System.lineSeparator() +
                String.format("%s", "--" + spaces + "|") + quotientStr + System.lineSeparator();
    }

    public static String midStep(int nextDigit, int multiple, int width) {
        String intermediateMultipleStr = String.valueOf(multiple);
        String intermediateDigitStr = String.valueOf(nextDigit);

        return String.format("%" + width + "s", "_" + intermediateDigitStr) + System.lineSeparator() +
                String.format("%" + width + "s", " " + intermediateMultipleStr) + System.lineSeparator() +
                String.format("%" + width + "s", "--") + System.lineSeparator();
    }

    public static String lastStep(int remainder, int width) {
        String remainderStr = String.valueOf(remainder);

        return String.format("%" + width + "s", " " + remainderStr);
    }
}
