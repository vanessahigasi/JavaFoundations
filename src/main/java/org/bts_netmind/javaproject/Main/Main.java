package org.bts_netmind.javaproject.Main;


import org.bts_netmind.javaproject.Model.MyDish;
import org.bts_netmind.javaproject.Model.Order;
import org.bts_netmind.javaproject.Service.OrderManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        OrderManager orderManager = new OrderManager();

        List<Order> orders = orderManager.readCsv();


        System.out.println(" ");
        System.out.println("--------------------  Welcome to the International Restaurant: ORDERS  ------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("# Number of orders: "+ orderManager.getNumberOrders(orders));
        System.out.println(" ");
        System.out.println("# Order: ");
        System.out.println("     " + orderManager.getOrder(orders, 1));
        System.out.println(" ");
        System.out.println("# All Orders: ");
        System.out.println(orderManager.getAllOrdersToString(orders));
        System.out.println("# Dish: ");
        System.out.println("     " + orderManager.getDish(getDishListFromOrderList(orders),0));
        System.out.println(" ");
        System.out.println("# All Dishes: ");
        System.out.println(orderManager.getAllDishToString(getDishListFromOrderList(orders)));
        System.out.println(" ");
        System.out.println("# Dish by 'st' type: ");
        System.out.println("    " + orderManager.getDishesByType(getDishListFromOrderList(orders),"st").toString());
        System.out.println(" ");
        System.out.println("# Dish by 'mc' type: ");
        System.out.println("    " + orderManager.getDishesByType(getDishListFromOrderList(orders),"mc").toString());
        System.out.println(" ");
        System.out.println("# Dish by 'vegetarian' feature: ");
        System.out.println("    " + orderManager.getDishesByFeature(getDishListFromOrderList(orders),"vegetarian").toString());
        System.out.println(" ");
        System.out.println("# Dish by 'glutenFree' feature: ");
        System.out.println("    " + orderManager.getDishesByFeature(getDishListFromOrderList(orders),"glutenFree").toString());
        System.out.println(" ");
        System.out.println("# Dish by Stats 'Main Course' type: ");
        System.out.println("    " + orderManager.getStatsByDishType(getDishListFromOrderList(orders),"mc") + "% of the dishes are Main Course");

    }

    private static List<MyDish> getDishListFromOrderList(List<Order> orders) {
        List<MyDish> dishList = new ArrayList<>();

        for (Order order: orders) {
            dishList.add(order.getDish());
        }

        return dishList;
    }
}




