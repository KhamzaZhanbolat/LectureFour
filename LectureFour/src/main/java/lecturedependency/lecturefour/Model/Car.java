package lecturedependency.lecturefour.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Car {
    private Long id;
    private String name;
    private double engineVolume;
    private int maxSpeed;
}
