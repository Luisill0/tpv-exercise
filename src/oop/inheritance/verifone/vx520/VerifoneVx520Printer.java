package oop.inheritance.verifone.vx520;

public class VerifoneVx520Printer {

    private VerifoneVx520Printer(){}

    private static class PrinterHolder{
        private static final VerifoneVx520Printer INSTANCE = new VerifoneVx520Printer();
    }

    public static VerifoneVx520Printer getInstance(){
        return PrinterHolder.INSTANCE;
    }

    /**
     * Prints a message on the current line at the specified horizontal position
     *
     * @param x       horizontal offset
     * @param message Message to be printed
     */
    public void print(int x, String message) {

    }

    /**
     * Add a line break to the paper
     */
    public void lineFeed() {
    }

}
