package exam.IASF.APFast.services;

import exam.IASF.APFast.dto.VehicleCreateDTO;
import exam.IASF.APFast.dto.VehicleEditDTO;
import exam.IASF.APFast.models.Vehicle;

import java.util.List;
import java.util.Optional;

public interface IVehicleService {
    Vehicle createVehicle(VehicleCreateDTO vehicleCreateDTO);

    List<Vehicle> getAllVehicles();

    Optional<Vehicle> getVehicleById(Long id);

    Vehicle updateVehicle(VehicleEditDTO vehicleEditDTO);

    void deleteVehicle(Long id);
}
