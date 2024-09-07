package exam.IASF.APFast.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vehicle {
    @Id
    private Long id;

    @Column(name = "vehicle_name", nullable = false, length = 64)
    private String vehicleName;

    @Column(name = "vehicle_model", nullable = false, length = 10)
    private String vehicleModel;

    @Column(name = "year_of_manufacture", nullable = false)
    private Integer yearOfManufacture;

    @Column(name = "vehicle_color", length = 16)
    private String vehicleColor;

}
