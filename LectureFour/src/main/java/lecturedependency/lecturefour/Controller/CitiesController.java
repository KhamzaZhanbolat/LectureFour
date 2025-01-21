package lecturedependency.lecturefour.Controller;

import lecturedependency.lecturefour.Service.Cities;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CitiesController {

    private final Cities cities;

    @GetMapping("/cities")
    public String cities(Model model){
        model.addAttribute("qalalar",cities.getCities());
        model.addAttribute("language",cities.getLanguage());
        return "cities";
    }
    @PostMapping("/setlanguage")
    public String setLanguage(@RequestParam String language){
        cities.setLanguage(language);

        return "redirect:/cities";
    }
}
