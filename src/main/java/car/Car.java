package car;

public abstract class Car {

    private final int distance;

    public Car(int distance) {
        this.distance = distance;
    }

    abstract String getCarName();

    abstract double getDistancePerLiter();

    public double getChargeQuantity(){
        return this.distance / getDistancePerLiter();
    }

    public String getCarReport(){
        StringBuilder sb = new StringBuilder();
        sb.append(getCarName()).append(" : ").append((int) Math.floor(getChargeQuantity()))
                .append("리터");
        return sb.toString();
    }
}
