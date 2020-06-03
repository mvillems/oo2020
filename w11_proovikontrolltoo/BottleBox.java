package app;

public class BottleBox {
    String boxType;
    double boxPrice;
    double weight;
    int bottleCapacity;
    double bottlesInside;
    Bottle bottle;

    public BottleBox(String boxType, double boxPrice, double weight, int bottleCapacity){
        this.boxType = boxType;
        this.boxPrice = boxPrice;
        this.weight = weight;
        this.bottleCapacity = bottleCapacity;
        bottlesInside = 0;
    }

    public String getBoxType() {
        return boxType;
    }

    public double getBoxPrice() {
        return boxPrice;
    }

    public double getWeight() {
        return weight;
    }

    public int getBottleCapacity(){
        return bottleCapacity;
    }

    public void addBottles(Bottle bottle){
        this.bottle = bottle;
    }

    public double getFullWeight() {
        if (bottlesInside == 0) {
            return weight;
        }else{
            return weight + (bottleCapacity * bottle.getFullMass());
        }
    }

    public double getFullBoxPrice() {
        if (bottlesInside == 0) {
            return boxPrice;
        }else{
            return boxPrice + (bottleCapacity * bottle.getFullPrice());
        }
    }
}