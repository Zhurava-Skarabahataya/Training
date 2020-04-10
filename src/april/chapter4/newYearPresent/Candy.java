package april.chapter4.newYearPresent;

abstract class Candy {
    String name;
    int sugarQuantity;
    int weight;
    int price;

    static Candy createCandy(int name) {
        switch (name) {
            case 1:
                return new Caramel();
            case 2:
                return new Alienka();
            case 3:
                return new Aeroflot();
            default:
                return new NotTastyCandy();
        }
    }
}
