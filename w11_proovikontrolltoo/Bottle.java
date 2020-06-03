package app;

public class Bottle {
    double volume; // L
    double mass;
    double packagePrice;
    double drinkInside;
    BottleType bottleType;
    Drink drink;

    public Bottle(double volume, double packagePrice, BottleType bottleType) {
        this.volume = volume;
        this.packagePrice = packagePrice;
        this.bottleType = bottleType;
        drink = null;
        drinkInside = 0;
        setMass();
    }

    public BottleType getBottleType() {
        return bottleType;
    }

    public Drink getDrink() {
        return drink;
    }

    public double getMass() {
        return mass;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public double getVolume() {
        return volume;
    }

    public double getDrinkInside() {
        return drinkInside;
    }

    public void addDrink(Drink drink) {
        this.drink = drink;
        this.drinkInside = volume;
    }

    public void addDrinkCustom(Drink drink, double amount) {
        this.drink = drink;
        this.drinkInside = amount;
    }

    public double getFullMass() {
        if (drink == null) {
            return mass;
        } else {
            return mass + drink.getDrinkMass(volume);
        }
    }

    public double getFullPrice() {
        if (drink == null) {
            return packagePrice;
        } else {
            return packagePrice + (volume * drink.getPricePerLiter());
        }
    }

    private void setMass() {
        if (this.bottleType == BottleType.GLASS) {
            mass = 65;
        } else {
            mass = 5;
        }
    }
}