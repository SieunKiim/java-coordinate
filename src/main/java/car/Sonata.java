package car;

public class Sonata extends Car{

    private static final String NAME = "Sonata";
    private static final int FUEL_EFFICIENCY = 10;


    public Sonata(int distance) {
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
