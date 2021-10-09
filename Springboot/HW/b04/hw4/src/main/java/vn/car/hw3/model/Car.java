package vn.car.hw3.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Long id;
    private String model;
    private String manufactor;
    private Long price;
    private Long sales;
    private String photo;
}
