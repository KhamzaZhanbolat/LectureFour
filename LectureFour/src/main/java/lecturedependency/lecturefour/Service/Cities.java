package lecturedependency.lecturefour.Service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Cities {

    @Getter
    @Setter
    private String language;

    List<String> qalalar = new ArrayList<>();
    List<String> goroda = new ArrayList<>();
    List<String> cities = new ArrayList<>();

    public Cities(String language) {
        this.language = language;

        qalalar.add("Алматы");
        qalalar.add("Астана");
        qalalar.add("Шымкент");
        qalalar.add("Ақтөбе");
        qalalar.add("Семей");
        qalalar.add("Өскемен");
        qalalar.add("Қарағанды");

        cities.add("Almaty");
        cities.add("Astana");
        cities.add("Shymkent");
        cities.add("Aktobe");
        cities.add("Semey");
        cities.add("Oskemen");
        cities.add("Karaganda");

        goroda.add("Алма-Ата");
        goroda.add("Астана");
        goroda.add("Чимкент");
        goroda.add("Актюбинск");
        goroda.add("Семипалатинск");
        goroda.add("Усть-Каменогорск");
        goroda.add("Караганда");
    }

    public List<String> getCities() {
        if (language.equals("KAZ")) {
            return qalalar;
        } else if (language.equals("RUS")) {
            return goroda;
        } else if (language.equals("ENG")) {
            return cities;
        }
        return Collections.emptyList();
    }
}
