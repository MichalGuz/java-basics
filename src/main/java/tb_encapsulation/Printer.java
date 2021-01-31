package tb_encapsulation;

public class Printer {
    private double tonerLevel;
    private int printedPages;
    private boolean duplex;

    public Printer(double tonerLevel, int printedPages, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.duplex = duplex;
    }
}
