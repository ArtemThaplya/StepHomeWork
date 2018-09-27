package homeWork_5.plane;

import homeWork_5.ClasificationPlane;

public class Airbus extends ClasificationPlane {
    private String model = "Airbus A380";
    private double speed = 900;
    private double weight = 180400;
    private double fullWeight = 279200;
    private double fuelStock = 248700;


    @Override
    public double  rangeOfFlight() {
        return (fuelStock / weight) * 10000.0;
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
        return "Airbus{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", fuelStock=" + fuelStock +
                '}';
    }
}
