public class DivisionStep {
    private int dividend;
    private int divisor;
    private int quotient;
    private int remainder;
    private int dividendLength;
    private int quotientLength;
    private int dividerMultiple;
    private int result;
    private DivisionStep stepCount;

    public DivisionStep(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.quotient = dividend / divisor;
        this.stepCount = null;
        dividendLength = String.valueOf(dividend).length();
        quotientLength = String.valueOf(quotient).length();


    }

    public DivisionStep(int dividend, int divisor, int result, int remainder, int multiple, DivisionStep stepCount) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.stepCount = stepCount;
        this.remainder = remainder;
        this.result = result;
        this.dividerMultiple = multiple;
        dividendLength = String.valueOf(dividend).length();

    }

    public int getDividendLength() {
        return dividendLength;
    }

    public int getQuotientLength() {
        return quotientLength;
    }

    public DivisionStep getStepCount() {
        return stepCount;
    }

    public void setStepCount(DivisionStep stepCount) {
        this.stepCount = stepCount;
    }

    public int getDividend() {
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getQuotient() {
        return quotient;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    public int getDividerMultiple() {
        return dividerMultiple;
    }

    public void setDividerMultiple(int dividerMultiple) {
        this.dividerMultiple = dividerMultiple;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}
