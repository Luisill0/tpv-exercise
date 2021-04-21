package oop.inheritance.verifone.vx690;

public class VerifoneVx690Printer {

    private VerifoneVx690Printer(){}

    private static class PrinterHolder{
        private static final VerifoneVx690Printer INSTANCE = new VerifoneVx690Printer();
    }

    public static VerifoneVx690Printer getInstance(){
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
