package oop.inheritance.ingenico;

public class IngenicoPrinter {

    private IngenicoPrinter(){}

    private static class PrinterHolder{
        private static final IngenicoPrinter INSTANCE = new IngenicoPrinter();
    }

    public static IngenicoPrinter getInstance(){
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
