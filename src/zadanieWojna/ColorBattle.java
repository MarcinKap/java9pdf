package zadanieWojna;

import java.util.List;

public class ColorBattle implements Battle {


    @Override
    public int checkWinner(List<Card> deckl, List<Card> deck2) {
       int colorValue = 0;
       for(Card c: deckl){
           colorValue += c.getColor().getValue();
       }
       int colorValue2 = 0;
       for (Card c: deck2){
           colorValue2 += c.getColor().getValue();
       }
       if(colorValue > colorValue2){
           return 1;
       } else if (colorValue < colorValue2){
           return 0;
       }



        return 0;
    }



}
