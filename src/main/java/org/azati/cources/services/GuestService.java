package org.azati.cources.services;

import org.azati.cources.entity.Guest;
import org.azati.cources.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GuestService {
    @Autowired
    private GuestRepository guestRepository;

    public Guest add(Guest guest) {
        return guestRepository.addGuest(guest);
    }

    public Boolean removeByName(String name) {
        return guestRepository.removeByName(name);
    }

    public Boolean remove(Guest guest) {
        return guestRepository.removeGuest(guest);
    }

    public Boolean remove(Integer index) {
        return guestRepository.removeGuest(index);
    }

    public Guest edit(Guest guest, Integer index) {
        return guestRepository.editGuest(guest, index);
    }

}
