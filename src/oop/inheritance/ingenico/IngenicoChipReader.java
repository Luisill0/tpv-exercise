package oop.inheritance.ingenico;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class IngenicoChipReader {

    private IngenicoChipReader(){}

    private static class ChipReaderHolder{
        private static final IngenicoChipReader INSTANCE = new IngenicoChipReader();
    }

    public static IngenicoChipReader getInstance(){
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
