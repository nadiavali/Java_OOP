package Printer;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100)? tonerLevel: -1;
        this.duplex = duplex;
    }

    public int addToner( int tonerAmount) {
        int tonerLevelAfterrefil = tonerLevel + tonerAmount;
        if (tonerLevelAfterrefil < 0 || tonerLevelAfterrefil > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesNeeded = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pagesNeeded;
        return pagesNeeded;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
    
}
