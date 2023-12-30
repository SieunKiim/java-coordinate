package car;

public class K5 extends Car {

    private static final String NAME = "K5";
    private static final int FUEL_EFFICIENCY = 13;


    public K5(int distance) {
        super(distance);
    }

    @Override
    public String getCarName() {
        return NAME;
    }

    @Override
    double getDistancePerLiter() {
        return FUEL_EFFICIENCY;
    }
}
