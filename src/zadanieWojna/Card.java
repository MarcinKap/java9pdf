package zadanieWojna;

public class Card {

    //todo value, color, boolean: rare
    private int value;
    private CardColor color;
    private boolean rare;

    public Card(int value, CardColor color, boolean rare) {
        this.value = value;
        this.color = color;
        this.rare = rare;
    }

    @Override
    public String toString() {
        return "(" +
                + value +
                ", " + color.getValue() +
                ", " + rare +
                ')';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CardColor getColor() {
        return color;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    public boolean isRare() {
        return rare;
    }

    public void setRare(boolean rare) {
        this.rare = rare;
    }
}
