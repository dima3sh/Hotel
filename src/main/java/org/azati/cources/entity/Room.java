package org.azati.cources.entity;

import org.azati.cources.enums.StatusRoom;

import java.util.ArrayList;

public class Room {
    private Integer idRoom;
    private Boolean isFreeRoom;
    private Integer numberOfBeds;
    private Integer costPerHour;
    private StatusRoom statusRoom;
    private ArrayList<Equipment> equipments;

    public Room(Integer idRoom, Boolean isFreeRoom, Integer numberOfBeds, Integer costPerHour,
                StatusRoom statusRoom, ArrayList<Equipment> equipments) {
        this.idRoom = idRoom;
        this.isFreeRoom = isFreeRoom;
        this.numberOfBeds = numberOfBeds;
        this.costPerHour = costPerHour;
        this.statusRoom = statusRoom;
        this.equipments = equipments;
    }

    public Integer getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Integer idRoom) {
        this.idRoom = idRoom;
    }

    public Boolean getFreeRoom() {
        return isFreeRoom;
    }

    public void setFreeRoom(Boolean freeRoom) {
        isFreeRoom = freeRoom;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Integer getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Integer costPerHour) {
        this.costPerHour = costPerHour;
    }

    public StatusRoom getStatusRoom() {
        return statusRoom;
    }

    public void setStatusRoom(StatusRoom statusRoom) {
        this.statusRoom = statusRoom;
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<Equipment> equipments) {
        this.equipments = equipments;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idRoom=" + idRoom +
                ", isFreeRoom=" + isFreeRoom +
                ", numberOfBeds=" + numberOfBeds +
                ", costPerHour=" + costPerHour +
                ", statusRoom=" + statusRoom +
                ", equipments=" + equipments +
                '}';
    }
}
