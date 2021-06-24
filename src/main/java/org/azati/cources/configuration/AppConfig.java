package org.azati.cources.configuration;

import org.azati.cources.entity.Equipment;
import org.azati.cources.enums.StateEquipment;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean
    public Equipment createEquipment(){
        return new Equipment("mobile", 0.75, 10, 2, StateEquipment.NEW, 3);
    }

}
