package exam.IASF.APFast.configuration;

import exam.IASF.APFast.dto.VehicleCreateDTO;
import exam.IASF.APFast.models.Vehicle;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.createTypeMap(VehicleCreateDTO.class, Vehicle.class)
                .addMappings(mapper -> mapper.skip(Vehicle::setId));

        return modelMapper;
    }

}
