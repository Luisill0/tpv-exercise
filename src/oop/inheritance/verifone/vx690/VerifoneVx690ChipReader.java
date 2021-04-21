package oop.inheritance.verifone.vx690;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneVx690ChipReader {

    private VerifoneVx690ChipReader(){}

    private static class ChipReaderHolder{
        private static final VerifoneVx690ChipReader INSTANCE = new VerifoneVx690ChipReader();
    }

    public static VerifoneVx690ChipReader getInstance(){
        return ChipReaderHolder.INSTANCE;
    }

    public Card readCard() {
        return Card.builder()
                .account("4558211532252558")
                .entryMode(EntryMode.INSERTED)
                .expirationDate(ExpirationDate.builder()
                        .year(20)
                        .month(8)
                        .build())
                .build();
    }

}
