package homeWork_12_planeExceptions;

import homeWork_12_planeExceptions.plane.Airbus;
import homeWork_12_planeExceptions.plane.Antonov;
import homeWork_12_planeExceptions.plane.Boeing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class SortedPlane {
    private Airbus airbus = new Airbus();
    private Antonov antonov = new Antonov();
    private Boeing boeing = new Boeing();
    private ArrayList<Double> arrayList = new ArrayList<Double>();
    private CountFlue countFlue = new CountFlue();

    public void sortPlane() {
        double airbusFlight = airbus.rangeOfFlight();
        arrayList.add(airbusFlight);

        double antonovFlight = antonov.rangeOfFlight();
        arrayList.add(antonovFlight);

        double boeingFlight = boeing.rangeOfFlight();
        arrayList.add(boeingFlight);
        Collections.sort(arrayList);
        System.out.println(airbus.toString() + " Длина полета: " + Math.round(airbusFlight)
                + "  Грузоподъемность :" + airbus.carryingCapacity()
                + "\n" + antonov.toString() + " Длина полета: " + Math.round(antonovFlight)
                + "  Грузоподъемность :" + antonov.carryingCapacity()
                + "\n" + boeing.toString() + " Длина полета: " + Math.round(boeingFlight)
                + "  Грузоподъемность :" + boeing.carryingCapacity()
                + "\n" + toString());
        try {
            countFlue.flue();
        } catch (InputMismatchException ex){
            countFlue.flue();
        }
    }

    @Override
    public String toString() {
        return "Сортировка по дальности полета: " + Math.round(arrayList.get(0))
                + "  " + Math.round(arrayList.get(1)) + "  " + Math.round(arrayList.get(2)) + ".";
    }
}

