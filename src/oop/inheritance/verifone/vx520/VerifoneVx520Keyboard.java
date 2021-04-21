package oop.inheritance.verifone.vx520;

public class VerifoneVx520Keyboard {

    private VerifoneVx520Keyboard(){}

    private static class KeyboardHolder{
        private static final VerifoneVx520Keyboard INSTANCE = new VerifoneVx520Keyboard();
    }

    public static VerifoneVx520Keyboard getInstance(){
        return KeyboardHolder.INSTANCE;
    }

    public String get(){
        return "Key pressed";
    }
}
