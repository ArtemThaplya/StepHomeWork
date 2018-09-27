package homeWork_12_planeExceptions.plane;


import homeWork_12_planeExceptions.ClasificationPlane;

public class Boeing extends ClasificationPlane {
    private String model = "Boeing 747";
    private double speed = 850;
    private double weight = 162400;
    private double fullWeight = 272400;
    private double fuelStock = 183380;

    @Override
    public double rangeOfFlight() {
        return (fuelStock / weight) * 10000.0;
    }

    @Override
    protected double fuelReserve(int fuel) {
        if (fuelStock > fuel) {
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
        return "Boeing{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", fuelStock=" + fuelStock +
                '}';
    }
}
