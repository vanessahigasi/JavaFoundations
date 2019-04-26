package org.bts_netmind.javaproject;

import java.util.ArrayList;
import java.util.List;

public class Order extends Dish{

    private String customerName;
    private String dishName;
    private DishType dishType;
    private boolean glutenFree;
    private boolean vegetarian;
    private boolean halalMeat;
    private boolean seafoodFree;
    private Object extras;
    private static List<Order> orders = new ArrayList<Order>();

    public Order(String[] item) {
        super();
        this.customerName = getCustomerName();

    }


    public Order(String customerName, String dishName, DishType dishType, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, Object extras) {
        this.customerName = customerName;
        this.dishName = dishName;
        this.dishType = dishType;
        this.glutenFree = glutenFree;
        this.vegetarian = vegetarian;
        this.halalMeat = halalMeat;
        this.seafoodFree = seafoodFree;
        this.extras = extras;
        orders.add(this);
    }

    public Dessert calories() {
        return this.calories();
    }


    public Object getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String getDishName() {
        return dishName;
    }

    @Override
    public void setDishName(String dishName) {
        this.dishName = dishName;
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

    public static List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer: " + this.customerName + " Dish: " + this.dishName + ", " +
                this.dishType + ", " + " Gluten-Free: " + this.glutenFree + ", " +
                " Vegetarian: " + this.vegetarian + ", " + "Halal-Meat: " + this.halalMeat +
                ", " + "SeaFood-Free: " + this.seafoodFree + " , " + "Extras: " + this.extras;

    }
}
