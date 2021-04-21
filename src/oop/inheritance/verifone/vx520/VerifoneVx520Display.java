package oop.inheritance.verifone.vx520;

import oop.inheritance.core.TPVDisplay;

public class VerifoneVx520Display implements TPVDisplay {

    private boolean lightTurnedOn;

    private VerifoneVx520Display(){}

    private static class DisplayHolder{
        private static final VerifoneVx520Display INSTANCE = new VerifoneVx520Display();
    }

    public static VerifoneVx520Display getInstance(){
        return DisplayHolder.INSTANCE;
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    @Override
    public void toggleLight() {
        lightTurnedOn = !lightTurnedOn;
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
