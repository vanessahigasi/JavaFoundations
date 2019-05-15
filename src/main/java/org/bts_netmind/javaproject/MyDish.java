package org.bts_netmind.javaproject;

public class MyDish extends Dish {

    private String dishName;
    private DishType dishType;
    private boolean glutenFree;
    private boolean vegetarian;
    private boolean halalMeat;
    private boolean seafoodFree;
    private Object extras;

    public MyDish() {
    }

    public MyDish (String dishName, DishType dishType, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, Object extras) {
        this.dishName = dishName;
        this.dishType = dishType;
        this.glutenFree = glutenFree;
        this.vegetarian = vegetarian;
        this.halalMeat = halalMeat;
        this.seafoodFree = seafoodFree;
        this.extras = extras;
    }

    @Override
    public String getDishName() {
        return dishName;
    }

    @Override
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Object getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isHalalMeat() {
        return halalMeat;
    }

    public void setHalalMeat(boolean halalMeat) {
        this.halalMeat = halalMeat;
    }

    public boolean isSeafoodFree() {
        return seafoodFree;
    }

    public void setSeafoodFree(boolean seafoodFree) {
        this.seafoodFree = seafoodFree;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }

    @Override
    public String toString() {

        String dishType = "";
        String extras = "";

        if(this.dishType == DishType.st){
            dishType = "Starter";
            extras = "Eaten with: ";
        } else if (this.dishType == DishType.mc){
            dishType = "Main Course";
            extras = "Best with: ";
        } else if(this.dishType == DishType.ds){
            dishType = "Dessert";
            extras = "Calories: ";
        }

        return this.dishName + ", Dish Type: " +
                dishType + ", " + " Gluten-Free: " + this.glutenFree + ", " +
                " Vegetarian: " + this.vegetarian + ", " + "Halal-Meat: " + this.halalMeat +
                ", " + "SeaFood-Free: " + this.seafoodFree + ", " + extras + this.extras+ ".\n";

    }

}
