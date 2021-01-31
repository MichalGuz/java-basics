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
            if (extraToner + tonerLevel >= 100) {
                this.tonerLevel = 100;
                System.out.println("Toner has been filled. Toner level = 100");
            }  else {
                this.tonerLevel = tonerLevel + extraToner;
                System.out.println("Toner has been filled. Toner level = " + this.tonerLevel);
            }
        } else {
            System.out.println("Toner level = " + tonerLevel);
            System.out.println("Extra toner = " + extraToner);
            System.out.println("Check toner and try again.");
        }
    }

    public void printPage(int numberOfPages) {
        int counter = 0;
        if (numberOfPages > 0) {
            for(int i = numberOfPages; i>0; i--) {
                counter += 1;
                System.out.println("printed page #" + counter);
                tonerLevel -= 0.2;
                if(tonerLevel <= 0) {
                    i = 0;
                    System.out.println("Empty toner. Fill the toner to continue the printing.");
                }
            }
        }
    }
}
