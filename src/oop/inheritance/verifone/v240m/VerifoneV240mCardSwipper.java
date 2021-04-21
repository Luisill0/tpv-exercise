package oop.inheritance.verifone.v240m;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneV240mCardSwipper {

    private VerifoneV240mCardSwipper(){}

    private static class CardSwipperHolder{
        private static final VerifoneV240mCardSwipper INSTANCE = new VerifoneV240mCardSwipper();
    }

    public static VerifoneV240mCardSwipper getInstance(){
        return CardSwipperHolder.INSTANCE;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
