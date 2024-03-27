public class DivisionAlgorithm {
    private DivisionStep firstStep;

    public DivisionAlgorithm(int dividend, int divisor) {
        this.firstStep = new DivisionStep(dividend, divisor);
        performDivision();
    }

    private void performDivision() {
        StringBuilder steps = new StringBuilder();
        DivisionStep currentStep = firstStep;
        int count = 0;
        String line = widthLine(currentStep.getQuotientLength());

        for (int i = currentStep.getDividendLength(); i > 0; i--) {
            int nextDigit = currentStep.getDividend() / (int) Math.pow(10, currentStep.getDividendLength() - 1);
            int middleResult = currentStep.getRemainder() * 10 + nextDigit;
            int middleRemainder = middleResult % currentStep.getDivisor();
            int dividerMultiple = middleResult - middleRemainder;

            if (count < 1) {
                steps.append(DivisionFormatter.headStep(currentStep.getDividend(), currentStep.getDivisor(), currentStep.getQuotient(), line, dividerMultiple));
            }
            currentStep.setDividend(currentStep.getDividend() % (int) Math.pow(10, currentStep.getDividendLength() - 1));
            currentStep.setStepCount(new DivisionStep(currentStep.getDividend(), currentStep.getDivisor(), middleResult, middleRemainder, dividerMultiple, currentStep.getStepCount()));
            currentStep = currentStep.getStepCount();
            count++;
            if (count == 1) {
                continue;
            }
            steps.append(DivisionFormatter.midStep(middleResult, dividerMultiple, count + 2));
        }
        steps.append(DivisionFormatter.lastStep(currentStep.getRemainder(), count + 2));
        System.out.print(steps);
    }

    private static String widthLine(int width) {
        String minus = "-";
        return minus.repeat(Math.max(0, width));
    }
}

