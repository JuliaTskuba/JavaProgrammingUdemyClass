package academy.learnprogramming;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        this.firstNumber = firstNumber;
        return this.firstNumber;
    }

    public double getSecondNumber() {
        this.secondNumber = secondNumber;
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        return getSecondNumber() * getFirstNumber();
    }

    public double getDivisionResult() {
        return getSecondNumber() == 0 ? 0 : getFirstNumber() / getSecondNumber();
    }
}
