package exam.IASF.APFast.services;

import exam.IASF.APFast.dto.VehicleCreateDTO;
import exam.IASF.APFast.dto.VehicleDTO;
import exam.IASF.APFast.dto.VehicleEditDTO;
import exam.IASF.APFast.models.Vehicle;
import exam.IASF.APFast.repository.VehicleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}
