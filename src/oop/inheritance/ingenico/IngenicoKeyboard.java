package oop.inheritance.ingenico;

public class IngenicoKeyboard {

    private IngenicoKeyboard(){}

    private static class KeyboardHolder{
        private static final IngenicoKeyboard INSTANCE = new IngenicoKeyboard();
    }

    public static IngenicoKeyboard getInstance(){
        return KeyboardHolder.INSTANCE;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}
