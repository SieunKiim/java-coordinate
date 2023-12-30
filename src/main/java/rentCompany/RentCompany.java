package rentCompany;

import car.Car;
import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private final List<Car> orderedCars;

    public RentCompany() {
        orderedCars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        orderedCars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car orderedCar : orderedCars) {
            sb.append(orderedCar.getCarReport());
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
