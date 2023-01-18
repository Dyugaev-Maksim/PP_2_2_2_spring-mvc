package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("BMW", "Lux", 5),
            new Car("VAZ", "WWW", 1),
            new Car("AUDI", "SSS", 2),
            new Car("OPEL", "TTT", 231),
            new Car("SUZUKI", "Grand Vitara", 2)
    );

    @Override
    public List<Car> getCountCar(Integer count) {
        if (count == null) {
            count = 5;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
