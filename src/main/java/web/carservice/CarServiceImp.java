package web.carservice;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {
    List<Car> cars1 = Arrays.asList(
            new Car("BMW", "Lux", 5),
            new Car("VAZ", "WWW", 1),
            new Car("AUDI", "SSS", 2),
            new Car("OPEL", "TTT", 231),
            new Car("SUZUKI", "Grand Vitara", 2)
    );
@Override
    public List<Car> getCountCar(String count1) {
        int count;
        if (count1 == null) {
            count = 5;
        } else {
            count = Integer.parseInt(count1);
        }
        return cars1.stream().limit(count).collect(Collectors.toList());
    }
}
