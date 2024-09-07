package exam.IASF.APFast.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleEditDTO {
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Size(max = 5, message = "Name must be less than 100 character")
    private String name;

    @NotBlank(message = "Vehicle Model is mandatory")
    private String vehicleModel;
    @NotBlank(message = "yearOfManufacture is mandatory")
    private Integer yearOfManufacture;
    @NotBlank(message = "Color is mandatory")
    private String vehicleColor;

}
