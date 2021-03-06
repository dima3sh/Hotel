package org.azati.cources.repository;

import org.azati.cources.entity.Guest;
import org.azati.cources.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository {
    private List<Room> roomRepository = new ArrayList<>();

    public Room addRoom(Room room) {
        roomRepository.add(room);
        return room;
    }

    public Boolean removeRoom(Room room) {
        return roomRepository.remove(room);
    }

    public Boolean removeRoom(Integer index) {
        roomRepository.remove((int)index);
        return true;
    }

    public Room editRoom(Room room, Integer index) {
        room = roomRepository.set(index, room);
        return room;
    }

    public Boolean removeById(Integer room_id) {
        final boolean[] flag = {false};
        ArrayList<Room> g = new ArrayList<>(roomRepository);

        g.forEach(room -> {
            if (room.getRoom_id().equals(room_id)) {
                roomRepository.remove(room);
                flag[0] = true;
            }
        });

        return flag[0];
    }

    public Boolean upCostRoom() {
        final boolean[] flag = {false};
        roomRepository.forEach(room -> {
            room.getEquipments().forEach(equipment -> {
                if (equipment.getName().equals("TV")) {
                    room.setCostPerHour(room.getCostPerHour() * 2);
                    flag[0] = true;
                }
            });
        });
        return flag[0];
    }
}
