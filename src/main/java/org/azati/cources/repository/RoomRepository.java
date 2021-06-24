package org.azati.cources.repository;

import org.azati.cources.entity.Guest;
import org.azati.cources.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository {
    private List<Room> guestRepository = new ArrayList<>();

    public Room addRoom(Room room) {
        guestRepository.add(room);
        return room;
    }

    public Boolean removeRoom(Room room) {
        return guestRepository.remove(room);
    }

    public Boolean removeRoom(Integer index) {
        guestRepository.remove((int)index);
        return true;
    }

    public Room editRoom(Room room, Integer index) {
        room = guestRepository.set(index, room);
        return room;
    }

    public Boolean removeById(Integer room_id) {
        final boolean[] flag = {false};
        ArrayList<Room> g = new ArrayList<>(guestRepository);

        g.forEach(room -> {
            if (room.getRoom_id().equals(room_id)) {
                guestRepository.remove(room);
                flag[0] = true;
            }
        });

        return flag[0];
    }
}
