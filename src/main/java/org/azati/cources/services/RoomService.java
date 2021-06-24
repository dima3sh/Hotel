package org.azati.cources.services;

import org.azati.cources.entity.Guest;
import org.azati.cources.entity.Room;
import org.azati.cources.repository.GuestRepository;
import org.azati.cources.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public RoomService(){}

    public RoomService (RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    public Room add(Room room) {
        return roomRepository.addRoom(room);
    }

    public Boolean removeById(Integer room_id) {
        return roomRepository.removeById(room_id);
    }

    public Boolean remove(Room room) {
        return roomRepository.removeRoom(room);
    }

    public Boolean remove(Integer index) {
        return roomRepository.removeRoom(index);
    }

    public Room edit(Room room, Integer index) {
        return roomRepository.editRoom(room, index);
    }
}
