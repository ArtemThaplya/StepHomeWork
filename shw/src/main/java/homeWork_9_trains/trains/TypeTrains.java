package homeWork_9_trains.trains;

public class TypeTrains {
    private Premium premium = new Premium(54, 50, 10, 10);
    private Low low = new Low(80, 67, 40, 50);
    private Cupe cupe = new Cupe(42, 40, 38, 44);
    private Sitdown sitdown = new Sitdown(86, 79, 23, 25);

    private String typeVagon;

    public String typeVagon(int number) {
        switch (number) {
            case 1:
                typeVagon = "ПРемиум";
                System.out.println("ПРемиум");
                premium.allPassengeBagaj();
                break;
            case 2:
                typeVagon = "Дешевый";
                System.out.println("Дешевый");
                low.allPassengeBagaj();
                break;
            case 3:
                typeVagon = "Купе";
                System.out.println("Купе");
                cupe.allPassengeBagaj();
                break;
            case 4:
                typeVagon = "Сидячий вагон";
                System.out.println("Сидячий вагон");
                sitdown.allPassengeBagaj();
                break;
        }
        return typeVagon;
    }

    public void typeChangeTrain(int number) {
        switch (number) {
            case 1:
                typeVagon = "ПРемиум";
                System.out.println("Выберите место от " + premium.getPassegAl() +
                        "до " + premium.getPassegMax() + ".");
                premium.setPassegAl(premium.getPassegAl() + 1);
                break;
            case 2:
                typeVagon = "Дешевый";
                System.out.println("Выберите место от " + low.getPassegAl() +
                        "до " + low.getPassegMax() + ".");
                low.setPassegAl(low.getPassegAl() + 1);
                break;
            case 3:
                typeVagon = "Купе";
                System.out.println("Выберите место от " + cupe.getPassegAl() +
                        " до " + cupe.getPassegMax() + ".");
                cupe.setPassegAl(low.getPassegAl() + 1);
                break;
            case 4:
                typeVagon = "Сидячий вагон";
                System.out.println("Выберите место от " + sitdown.getPassegAl() +
                        "до " + sitdown.getPassegMax() + ".");
                sitdown.setPassegAl(sitdown.getPassegAl() + 1);
                break;
        }
    }
}
