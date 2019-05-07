package zadanieWojna;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


    }


    public static List<Card> createDeck(int rareSeed, int deckSize) {
        List<Card> rc = new ArrayList<>();
        Random random = new Random(rareSeed);

        for (int i = 0; i < deckSize; i++) {
            int cValue = random.nextInt(10) + 1;
            CardColor cColor = CardColor.values()[random.nextInt(CardColor.values().length)];
            boolean cRare = random.nextBoolean();
            rc.add(new Card(cValue, cColor, cRare));
        }
        return rc;

    }

    //public void printDeck ()



//todo printDeck - iteracja po decku i wyswietlanie wartosci karty.

}
