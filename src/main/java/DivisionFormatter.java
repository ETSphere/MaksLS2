public class DivisionFormatter {

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

