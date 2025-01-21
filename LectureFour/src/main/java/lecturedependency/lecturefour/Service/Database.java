package lecturedependency.lecturefour.Service;

import lecturedependency.lecturefour.Model.Car;
import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Database {

    private List<Car> cars = new ArrayList<>();

    public Database(){
        cars.add(new Car(1L, "Mercedes", 2.7, 220));
        cars.add(new Car(2L, "Toyota", 2.2, 210));
        cars.add(new Car(3L, "KIA", 1.6, 190));
        cars.add(new Car(4L, "Lexus", 3.3, 240));
        cars.add(new Car(5L, "Range Rover", 4.8, 300));
    }

    public void addCar(String carName, double engineVolume, int maxSpeed){
        Car newCar = Car
                .builder()
                .name(carName)
                .maxSpeed(maxSpeed)
                .engineVolume(engineVolume)
                .id(cars.size()+1L)
                .build();

        cars.add(newCar);
    }
    public void deleteCar(Long id){
        cars.stream().filter(car -> car.getId().equals(id)).findFirst().ifPresent(car -> cars.remove(car));
    }
}
