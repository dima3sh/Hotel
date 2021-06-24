package org.azati.cources.configuration;

import org.azati.cources.entity.Equipment;
import org.azati.cources.enums.StateEquipment;
import org.azati.cources.repository.GuestRepository;
import org.azati.cources.services.GuestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Equipment createEquipment() {
        return new Equipment("mobile", 0.75, 10, 2, StateEquipment.NEW, 3);
    }

    @Bean
    public GuestRepository guestRepository() {
        return new GuestRepository();
    }

    @Bean
    public GuestService guestService(){
        return new GuestService();
    }
}
