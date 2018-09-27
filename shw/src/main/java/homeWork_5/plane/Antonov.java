package homeWork_5.plane;

import homeWork_5.ClasificationPlane;

public class Antonov extends ClasificationPlane {
    private String model = "AHH 225";

    private double speed = 750;
    private double weight = 201070;
    private double fullWeight = 328070;
    private double fuelStock = 290600;
    @Override
    public double rangeOfFlight() {
        return (fuelStock/weight)*10000.0;
    }

    public String getModel() {
        return model;
    }

    @Override
    protected double fuelReserve(int fuel) {
        if (fuelStock > fuel){
            return fuelStock;
        }
        return fuel;
    }

    @Override
    public double carryingCapacity() {
        return fullWeight - weight;
    }

    @Override
    public String toString() {
        return "Antonov{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", fuelStock=" + fuelStock +
                '}';
    }
}
