package oop.inheritance.verifone.v240m;

public class VerifoneV240mKeyboard {

    private VerifoneV240mKeyboard(){}

    private static class KeyboardHolder{
        private static final VerifoneV240mKeyboard INSTANCE = new VerifoneV240mKeyboard();
    }

    public static VerifoneV240mKeyboard getInstance(){
        return KeyboardHolder.INSTANCE;
    }

    public String get(){
        return "Key pressed";
    }
}
