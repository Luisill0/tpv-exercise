package oop.inheritance.core;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;
import oop.inheritance.verifone.vx520.VerifoneVx520Display;
import oop.inheritance.verifone.vx690.VerifoneVx690Display;

public class TPVFactory {

    SupportedTerminal supportedTerminal;

    public TPVFactory(SupportedTerminal supportedTerminal) {
        this.supportedTerminal = supportedTerminal;
    }

    public TPVDisplay getDisplayInstance(){

        switch(supportedTerminal){
            case INGENICO:
                return IngenicoDisplay.getInstance();
            case VERIFONE_240:
                return VerifoneV240mDisplay.getInstance();
            case VERIFONE_520:
                return VerifoneVx520Display.getInstance();
            case VERIFONE_690:
                return VerifoneVx690Display.getInstance();
            default:
                return null;
        }
    }
}
