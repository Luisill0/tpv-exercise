package oop.inheritance.verifone.v240m;

import oop.inheritance.core.TPVDisplay;

public class VerifoneV240mDisplay implements TPVDisplay {

    private VerifoneV240mDisplay(){}

    private boolean lightTurnedOn;

    private static class DisplayHolder{
        private static final VerifoneV240mDisplay INSTANCE = new VerifoneV240mDisplay();
    }

    public static VerifoneV240mDisplay getInstance(){
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
