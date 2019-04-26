package org.bts_netmind.javaproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderManager implements OnlineOrderOps {

    public OrderManager() {

    }

    public List<Order> readCsv() throws IOException {

        BufferedReader reader = null;

        List<Order> orders = new ArrayList<>();

        try {
            File file = new File("/Users/vanessahigasi/JavaFoundations/src/main/resources/online-order-sample.csv");
            reader = new BufferedReader(new FileReader(file));
            reader.readLine();

            String line1 = null;

            String line;
            while ((line = reader.readLine()) != null) {

                String[] items = line.split(",");

                for(int i = 0; i <= items.length-1; i++){

                    System.out.println(items[i]);
                }
                orders.add(new Order(items));

                //Order order = new Order(items[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return orders;
    }


    @Override
    public int getNumberOrders(List orderList) {
        return 0;
    }

    @Override
    public Object getOrder(List orderList, int orderIndex) {
        return null;
    }

    @Override
    public String getAllOrdersToString(List orderList) {
        return null;
    }

    @Override
    public Dish getDish(List dishList, int dishIndex) {
        return null;
    }

    @Override
    public String getAllDishToString(List dishList) {
        return null;
    }

    @Override
    public List getDishesByType(List dishList, String dishType) {
        return null;
    }

    @Override
    public List getDishesByFeature(List dishList, String feature) {
        return null;
    }

    @Override
    public String getStatsByDishType(List dishList, String dishType) {
        return null;
    }
}
