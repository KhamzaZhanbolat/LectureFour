package lecturedependency.lecturefour.Controller;

import lecturedependency.lecturefour.Service.Database;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class OtherController {

    private final Database database;

    @PostMapping("/delete_car/{id}")
    public String deleteCar(@PathVariable(value = "id")Long id){
        database.deleteCar(id);
        return "redirect:/cars";
    }
}
