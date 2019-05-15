package org.bts_netmind.javaproject;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        //Order order1 = new Order("Peter Parker", "cinnamon custard",DishType.DESSERT,false,false,false,true, 120);
        //System.out.println(order1);


        OrderManager orderManager = new OrderManager();

        List<Order> orders = orderManager.readCsv();


        System.out.println("----------------Welcome to the Restaurant: ORDERS  ------------------------------");
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
        System.out.println("    " + orderManager.getStatsByDishType(getDishListFromOrderList(orders),"mc"));


    }

    private static List<MyDish> getDishListFromOrderList(List<Order> orders) {
        List<MyDish> dishList = new ArrayList<>();

        for (Order order: orders) {
            dishList.add(order.getDish());
        }

        return dishList;
    }
}




