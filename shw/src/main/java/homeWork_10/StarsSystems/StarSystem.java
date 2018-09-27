package homeWork_10.StarsSystems;

class StarSystem {
    Planet[] array = new Planet[8];
//    private MenuPrintConsole menuPrintConsole = new MenuPrintConsole();                //todo  интересное!!! переполнение стека

    void countPlane() {
        Planet<String, Integer> planet1 = new Planet<>("Merkyriy", 57910000);
        Planet<String, Integer> planet2 = new Planet<>("Venera", 108200000);
        Planet<String, Integer> planet3 = new Planet<>("Zemly", 149600000);
        Planet<String, Integer> planet4 = new Planet<>("Mars", 227900000);
        Planet<String, Integer> planet5 = new Planet<>("Upiter", 778500000);
        Planet<String, Integer> planet6 = new Planet<>("Saturn", 1433449370);
        Planet<String, Integer> planet7 = new Planet<>("Uran", 2105489000);
        //    Planet<String, Long> planet8 = new Planet<String, Long>("Neptun", 4105489000);
        array[0] = planet1;
        array[1] = planet2;
        array[2] = planet3;
        array[3] = planet4;
        array[4] = planet5;
        array[5] = planet6;
        array[6] = planet7;

//        menuPrintConsole.array[0].setName("Merkyriy");
//        menuPrintConsole.array[0].setDistance(57910000);
//        menuPrintConsole.array[1].setName("Venera");
//        menuPrintConsole.array[1].setDistance(108200000);
//        menuPrintConsole.array[2].setName("Zemly");
//        menuPrintConsole.array[2].setDistance(149600000);
//        menuPrintConsole.array[3].setName("Mars");                           // второй    способ
//        menuPrintConsole.array[3].setDistance(227900000);
//        menuPrintConsole.array[4].setName("Upiter");
//        menuPrintConsole.array[4].setDistance(778500000);
//        menuPrintConsole.array[5].setName("Saturn");
//        menuPrintConsole.array[5].setDistance(1433449370);
//        menuPrintConsole.array[6].setName("Uran");
//        menuPrintConsole.array[6].setDistance(2105489000);

    }
}
