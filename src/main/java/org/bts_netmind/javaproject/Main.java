package org.bts_netmind.javaproject;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Order order1 = new Order("Peter Parker", "cinnamon custard",DishType.DESSERT,false,false,false,true, 120);
        //System.out.println(order1);


        OrderManager orderManager = new OrderManager();

        System.out.println(orderManager.readCsv());
    }
}




