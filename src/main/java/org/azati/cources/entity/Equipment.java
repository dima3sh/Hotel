package org.azati.cources.entity;

import org.azati.cources.enums.StateEquipment;

public class Equipment extends Thing{
    private Integer equipment_id;
    private StateEquipment stateEquipment;
    private Integer room_id;

    public Equipment(String name, Integer weight, Integer costPerObject,
                     Integer equipment_id, StateEquipment stateEquipment, Integer room_id) {
        super(name, weight, costPerObject);
        this.equipment_id = equipment_id;
        this.stateEquipment = stateEquipment;
        this.room_id = room_id;
    }

    public Integer getEquipment_id() {
        return equipment_id;
    }

    public StateEquipment getStateEquipment() {
        return stateEquipment;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setEquipment_id(Integer equipment_id) {
        this.equipment_id = equipment_id;
    }

    public void setStateEquipment(StateEquipment stateEquipment) {
        this.stateEquipment = stateEquipment;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipment_id=" + equipment_id +
                ", stateEquipment=" + stateEquipment +
                ", room_id=" + room_id +
                "} " + super.toString();
    }
}
