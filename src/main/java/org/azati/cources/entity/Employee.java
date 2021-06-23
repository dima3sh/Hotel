package org.azati.cources.entity;

import org.azati.cources.enums.StateEquipment;

import java.time.LocalDateTime;

public class Employee extends Thing {
    private  Integer employee_id;
    private StateEquipment stateEquipment;
    private Integer roomNumber;

    public Employee(String name, Integer weight, Integer costPerObject, Integer employee_id,
                    StateEquipment stateEquipment, Integer roomNumber) {
        super(name, weight, costPerObject);
        this.employee_id = employee_id;
        this.stateEquipment = stateEquipment;
        this.roomNumber = roomNumber;
    }

    public  Integer getEmployee_id() {
        return employee_id;
    }

    public StateEquipment getStateEquipment() {
        return stateEquipment;
    }

    public Integer getNumber() {
        return roomNumber;
    }

    public void setStateEquipment(StateEquipment stateEquipment) {
        this.stateEquipment = stateEquipment;
    }

    public void setNumber(Integer number) {
        this.roomNumber = number;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "stateEquipment=" + stateEquipment +
                ", roomNumber=" + roomNumber +
                "} " + super.toString();
    }
}
