package pract30;

public class Drink {
    public final double alcoholVol;
    DrinkTypeEnum type;

    public Drink(double alcoholVol) {
        this.alcoholVol = alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }
}
