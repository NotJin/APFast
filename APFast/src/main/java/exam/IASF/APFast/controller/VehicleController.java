package exam.IASF.APFast.controller;

import exam.IASF.APFast.dto.VehicleCreateDTO;
import exam.IASF.APFast.dto.VehicleDTO;
import exam.IASF.APFast.models.Vehicle;
import exam.IASF.APFast.services.IVehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class VehicleController {
    private final IVehicleService vehicleService;

    @Autowired
    public VehicleController (IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/list")
    public List<Vehicle> getAllCategories(Model model) {
        List<Vehicle> vehicles = vehicleService.getAllVehicles();
        model.addAttribute("vehicles", vehicles);
        return vehicleService.getAllVehicles();
    }

    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@Valid @RequestBody VehicleCreateDTO vehicleCreateDTO) {
        Vehicle vehicleDTO = vehicleService.createVehicle(vehicleCreateDTO);
        return new ResponseEntity<>(vehicleDTO, HttpStatus.CREATED);
    }
}
