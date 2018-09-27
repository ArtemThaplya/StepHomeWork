package sorokDva;

import homeWork_1.abstracInterface.Developer;
import homeWork_1.abstracInterface.Pilot;
import homeWork_1.abstracInterface.Profession;

public class Main {

    public static void main(String[] args) {
        Developer developer = new Developer("P4ela", "biker", "moto");
        InnerClass<Developer> innerClass = new InnerClass<>();
        String name = innerClass.introducer(developer);
        System.out.println(name);
        Pilot pilot = new Pilot("Micha", "aero", "bla");
        String pilotName = new InnerClass<Pilot>().introducer(pilot);
        System.out.println(pilotName);

    }

    static class InnerClass<T extends Profession> {
        String introducer(T o) {
            return o.getName();
        }
    }

//    public static void main(String[] args) {
//        Object o = new Planet(42, 42);
//        InnerClass<Planet> planetInnerClass = new InnerClass<>();
//        Planet caster = planetInnerClass.caster(o);
//        System.out.println(caster);
//        System.out.println(caster.getClass());
//        System.out.println("*************************");
//        Object o2 = new Moon("blah");
//        InnerClass<Moon> moonInnerClass = new InnerClass<>();
//        Moon caster1 = moonInnerClass.caster(o2);
//        System.out.println(caster1);
//        System.out.println(caster1.getClass());
//    }
//
//    static class InnerClass <T>{
//        T caster(Object o) {
//            return (T) o;
//        }
//    }

}
