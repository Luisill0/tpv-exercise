package oop.inheritance.verifone.vx690;

public class VerifoneVx690Keyboard {

    private VerifoneVx690Keyboard(){}

    private static class KeyboardHolder{
        private static final VerifoneVx690Keyboard INSTANCE = new VerifoneVx690Keyboard();
    }

    public static VerifoneVx690Keyboard getInstance(){
        return KeyboardHolder.INSTANCE;
    }

    public String get(){
        return "Key pressed";
    }
}
