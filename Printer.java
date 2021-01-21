package academy.learnprogramming;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
        if (tonerLevel <= 100 && tonerLevel >- 1) {
            this.tonerLevel = tonerLevel;
        } else this.tonerLevel = -1;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(int toner) {
        if (tonerLevel + toner > 100) {
            this.tonerLevel = -1;
        } else if (tonerLevel + toner < 0) {
            this.tonerLevel = -1;
        } else
            this.tonerLevel += toner;
    }

    public void printPage() {
        System.out.println("page printed");
        numberOfPagesPrinted++;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
