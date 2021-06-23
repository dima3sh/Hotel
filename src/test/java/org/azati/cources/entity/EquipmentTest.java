package org.azati.cources.entity;

import org.azati.cources.enums.StateEquipment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EquipmentTest {
    Equipment equipment = new Equipment("name", 20.0, 10, 1, StateEquipment.NEW, 1);

    @Test
    public void getStateEquipmentTest() {
        System.out.println(equipment.getStateEquipment().ordinal());
        Assert.assertEquals(equipment.getStateEquipment(), StateEquipment.NEW);
    }

}
