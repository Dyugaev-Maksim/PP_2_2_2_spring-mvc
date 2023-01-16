package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.businessLogic.BusinessLogic;
import web.carService.CarServiceImp;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/car")
    String getCarList(Model model,
                      @RequestParam(value = "count", required = false) String count1) {
        CarServiceImp carServiceImp= new CarServiceImp();
        model.addAttribute("something", "Car table");
        model.addAttribute("car", carServiceImp.logic(count1));
        return "car";
    }
}
