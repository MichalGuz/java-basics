package tb_encapsulation;

public class Printer {
    private double tonerLevel;
    private int printedPages;
    private boolean duplex;

    public Printer(double tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.printedPages = 0;
        this.duplex = duplex;
    }

    public void fillTheToner(double extraToner) {
        if (tonerLevel < 100 && tonerLevel >= 0 && extraToner > 0 && extraToner < 101) {
        }
    }
}