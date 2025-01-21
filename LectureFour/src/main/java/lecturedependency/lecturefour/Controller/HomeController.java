package lecturedependency.lecturefour.Controller;

import lecturedependency.lecturefour.Service.Cities;
import lecturedependency.lecturefour.Service.Database;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final Database database;
    private final Cities cities;


    @GetMapping(value = "/cars")
    public String carsPage(Model model){
        model.addAttribute("mashinalar", database.getCars());

        return "cars";
    }

    @PostMapping(value = "/addcar")
    public String addCar(@RequestParam(name = "car_name") String carName,
                         @RequestParam(name = "engine_volume") double engineVolume,
                         @RequestParam(name = "max_speed") int maxSpeed){
        database.addCar(carName, engineVolume, maxSpeed);

        return "redirect:/cars";
    }
}