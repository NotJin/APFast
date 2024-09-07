package exam.IASF.APFast.controller;

import exam.IASF.APFast.dto.VehicleCreateDTO;
import exam.IASF.APFast.dto.VehicleDTO;
import exam.IASF.APFast.models.Vehicle;
import exam.IASF.APFast.services.IVehicleService;
import exam.IASF.APFast.services.VehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        return ResponseEntity.ok(vehicleService.getAllVehicles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable Long id) {
        Vehicle vehicle = vehicleService.getVehicleById(id);
        return vehicle != null ? ResponseEntity.ok(vehicle) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Vehicle> saveVehicle(@RequestBody @Valid Vehicle vehicle) {
        return ResponseEntity.ok(vehicleService.saveVehicle(vehicle));
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Vehicle> updateVehicle(@PathVariable Long id, @RequestBody @Valid Vehicle vehicle) {
//        Vehicle existingVehicle = vehicleService.getVehicleById(id);
//        if (existingVehicle != null) {
//            existingVehicle.setName(vehicle.getName());
//            existingVehicle.setDescription(vehicle.getDescription());
//            existingVehicle.setPrice(vehicle.getPrice());
//            existingVehicle.setImage(vehicle.getImage());
//            return ResponseEntity.ok(vehicleService.saveVehicle(existingVehicle));
//        }
//        return ResponseEntity.notFound().build();
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
        return ResponseEntity.noContent().build();
    }
}
