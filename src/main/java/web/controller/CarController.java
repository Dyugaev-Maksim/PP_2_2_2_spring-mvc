package web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {
    ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(CarServiceImp.class);
    CarServiceImp bean = applicationContext.getBean(CarServiceImp.class);

    @GetMapping("/car")
    String getCarList(Model model,
                      @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("something", "Car table");
        model.addAttribute("car", bean.getCountCar(count));
        return "car";
    }
}
