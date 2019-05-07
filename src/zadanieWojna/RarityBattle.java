package zadanieWojna;

import java.util.List;

public class RarityBattle implements Battle {


    @Override
    public int checkWinner(List<Card> deckl, List<Card> deck2) {

        int deckRareCounter = 0;
        for(Card c : deckl){

            if(c.isRare()) deckRareCounter++;
        }
int deck2RareCounter = 0;

        for(Card c : deck2){

            if(c.isRare()) deck2RareCounter++;
        }
if(deckRareCounter > deck2RareCounter){
    return 1;
}else if(deckRareCounter < deck2RareCounter){
    return -1;
}else
    return 0;
    }
}
