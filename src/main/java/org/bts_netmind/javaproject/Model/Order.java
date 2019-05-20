package org.bts_netmind.javaproject.Model;

public class Order {

    private String customerName;
    private MyDish dish;

    public Order() {
    }

    public Order(String customerName, MyDish dish) {
        this.customerName = customerName;
        this.dish = dish;
    }

    public MyDish getDish() {
        return dish;
    }

    public void setDish(MyDish dish) {
        this.dish = dish;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer: " + this.customerName + ", Dish: " + this.dish;
    }

}