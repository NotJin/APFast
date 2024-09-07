package exam.IASF.APFast.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VehicleDTO {
    private Long id;
    private String name;
    private String vehicleModel;
    private Integer yearOfManufacture;
    private String vehicleColor;
}
