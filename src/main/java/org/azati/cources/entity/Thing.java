package org.azati.cources.entity;

public class Thing {
    private String name;
    private Integer weight;
    private Integer costPerObject;

    public Thing(String name,Integer weight, Integer costPerObject) {
        this.name = name;
        this.weight = weight;
        this.costPerObject = costPerObject;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getCostPerObject() {
        return costPerObject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setCostPerObject(Integer costPerObject) {
        this.costPerObject = costPerObject;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", costPerObject=" + costPerObject +
                '}';
    }
}
