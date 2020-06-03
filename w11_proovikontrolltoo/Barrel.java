package app;

import java.util.ArrayList;
import java.util.List;

public class Barrel {
    double volume; // vaadi mahutatavus
    double drinkInside; // vaadis oleva joogi kogus
    Drink drink;

    public Barrel(double volume) {
        this.volume = volume;
        drinkInside = 0;
        drink = null;
    }

    public Drink getDrink() {
        return drink;
    }

    public double getVolume() {
        return volume;
    }

    public double getDrinkInside() {
        return drinkInside;
    }
    public void addDrink(Drink drink) {
        this.drink = drink;
        this.drinkInside = this.volume;
    }

    public void fillBottle(Bottle bottle) {
        if(drinkInside >= bottle.getVolume()) {
            bottle.addDrink(drink);
            drinkInside -= bottle.getVolume();
        }else {
            bottle.addDrinkCustom(drink, drinkInside);
            drinkInside = 0;
        }
    }
    public List<Bottle> emptyToBottles() {
        List<Bottle> bottles = new ArrayList<>();
        if (drinkInside != 0) {
            while (drinkInside != 0) {
                Bottle bottle = new Bottle(1, 0.1, BottleType.PLASTIC);
                fillBottle(bottle);
                bottles.add(bottle);
            } 
        }
        return bottles;
    }
}