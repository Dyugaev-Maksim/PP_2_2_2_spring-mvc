package web.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Component
@Controller
public class CarController {
    public CarServiceImp carServiceImp;

    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping("/car")
    public String getCarList(Model model,
                             @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("something", "Car table");
        model.addAttribute("car", carServiceImp.getCountCar(count));
        return "car";
    }
}
