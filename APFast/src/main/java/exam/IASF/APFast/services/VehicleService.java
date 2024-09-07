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
public class VehicleService implements IVehicleService{
    private final VehicleRepository vehicleRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository, ModelMapper modelMapper) {
        this.vehicleRepository = vehicleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Vehicle createVehicle(VehicleCreateDTO vehicleCreateDTO) {

        return null;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = vehicleRepository.findAll();
        return vehicles.stream()
                .map(vehicle -> modelMapper.map(vehicle, Vehicle.class))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Vehicle> getVehicleById(Long id) {
        return Optional.empty();
    }

    @Override
    public Vehicle updateVehicle(VehicleEditDTO vehicleEditDTO) {
        return null;
    }

    @Override
    public void deleteVehicle(Long id) {

    }
}
