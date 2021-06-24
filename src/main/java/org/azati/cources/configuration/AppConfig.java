package org.azati.cources.configuration;

import org.azati.cources.entity.Equipment;
import org.azati.cources.enums.StateEquipment;
import org.azati.cources.repository.GuestRepository;
import org.azati.cources.repository.RoomRepository;
import org.azati.cources.services.GuestService;
import org.azati.cources.services.RoomService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

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
    public GuestService guestService() {
        return new GuestService();
    }

    @Bean
    public RoomRepository roomRepository() {
        return new RoomRepository();
    }

    @Bean
    public RoomService roomService() {
        return new RoomService();
    }
}
