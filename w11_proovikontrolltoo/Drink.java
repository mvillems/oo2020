package app;

public class Drink {
    private String name;
    private double pricePerLiter;
    private double massPerLiter; // 1000g

    public Drink(String name, double pricePerLiter, double massPerLiter) {
        this.name = name;
        this.pricePerLiter = pricePerLiter;
        this.massPerLiter = massPerLiter;
    }

    public String getName() {
        return name;
    }

    public double getMassPerLiter() {
        return massPerLiter;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public double getDrinkMass(double volume) {
        return massPerLiter * volume;
    }

}