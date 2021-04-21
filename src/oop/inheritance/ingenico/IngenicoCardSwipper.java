package oop.inheritance.ingenico;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class IngenicoCardSwipper {

    private IngenicoCardSwipper(){}

    private static class CardSwipperHolder{
        private static final IngenicoCardSwipper INSTANCE = new IngenicoCardSwipper();
    }

    public static IngenicoCardSwipper getInstance(){
        return CardSwipperHolder.INSTANCE;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
