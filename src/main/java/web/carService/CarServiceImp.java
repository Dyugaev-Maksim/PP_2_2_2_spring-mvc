package web.carService;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarServiceImp implements CarService {
    public List<Car> getCar(List<Car> c, int a) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            cars.add(c.get(i));
        }
        return cars;
    }
    public List<Car> logic(String count1) {
        int count;
        if (count1 == null) {
            count = 5;
        } else {
            count = Integer.parseInt(count1);
        }
        List<Car> cars1 = Arrays.asList(
                new Car("BMW", "Lux", 5),
                new Car("VAZ", "WWW", 1),
                new Car("AUDI", "SSS", 2),
                new Car("OPEL", "TTT", 231),
                new Car("SUZUKI", "Grand Vitara", 2)
        );
        CarServiceImp carService = new CarServiceImp();
        List<Car> cars2 = count >= 5 ? carService.getCar(cars1, 5) : carService.getCar(cars1, count);
        return cars2;
    }
}
