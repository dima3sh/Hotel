package org.azati.cources.repository;

import org.azati.cources.entity.Guest;
import java.util.ArrayList;
import java.util.List;


public class GuestRepository {
    private List<Guest> guestRepository = new ArrayList<>();

    public Guest addGuest(Guest guest) {
        guestRepository.add(guest);
        return guest;
    }

    public Boolean removeGuest(Guest guest) {
        return guestRepository.remove(guest);
    }

    public Boolean removeGuest(Integer index) {
        guestRepository.remove((int)index);
        return true;
    }

    public Guest editGuest(Guest guest, Integer index) {
        guest = guestRepository.set(index, guest);
        return guest;
    }

    public Boolean removeByName(String name) {
        final boolean[] flag = {false};

        guestRepository.forEach(guest -> {
            if (guest.getName().equals(name)) {
                guestRepository.remove(guest);
                flag[0] = true;
            }
        });
        return flag[0];
    }
}
