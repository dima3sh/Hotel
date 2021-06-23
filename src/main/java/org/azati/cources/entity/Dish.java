package org.azati.cources.entity;

import java.util.ArrayList;

public class Dish extends Thing{
    private Integer caloric;
    private Integer dish_id;
    private ArrayList<Food> foods;

    public Dish(String name, Integer weight, Integer costPerObject, Integer caloric, Integer dish_id, ArrayList<Food> foods) {
        super(name, weight, costPerObject);
        this.caloric = caloric;
        this.dish_id = dish_id;
        this.foods = foods;
    }

    public Integer getCaloric() {
        return caloric;
    }

    public Integer getDish_id() {
        return dish_id;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setCaloric(Integer caloric) {
        this.caloric = caloric;
    }

    public void setDish_id(Integer dish_id) {
        this.dish_id = dish_id;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "caloric=" + caloric +
                ", foods=" + foods +
                "} " + super.toString();
    }
}
