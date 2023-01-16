package web.carService;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCar(List<Car> c, int a);
    List<Car> logic(String count1);
}
