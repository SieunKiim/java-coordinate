package car;

public class Avante extends Car{

    private static final String NAME = "Avante";
    private static final int FUEL_EFFICIENCY = 15;

    public Avante(int distance) {
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
