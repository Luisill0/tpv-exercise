package oop.inheritance.verifone.vx690;

import oop.inheritance.core.TPVDisplay;

public class VerifoneVx690Display implements TPVDisplay {

    private boolean lightTurnedOn;

    private VerifoneVx690Display(){}

    private static class DisplayHolder{
        private static final VerifoneVx690Display INSTANCE = new VerifoneVx690Display();
    }

    public static VerifoneVx690Display getInstance(){
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
