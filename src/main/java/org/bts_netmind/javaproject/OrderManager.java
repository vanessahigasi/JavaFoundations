package org.bts_netmind.javaproject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderManager implements OnlineOrderOps<Order, MyDish> {

    public OrderManager() {

    }

    public List<Order> readCsv() {

        BufferedReader reader = null;

        List<Order> orders = new ArrayList<>();

        try {
            File file = new File("./src/main/resources/online-order-sample.csv");
            reader = new BufferedReader(new FileReader(file));
            reader.readLine();   // skips first line

            String line;
            while ((line = reader.readLine()) != null) {

                String[] items = line.split(",");

                List<String> elements = new ArrayList<>();

                for(int i = 0; i <= items.length-1; i++){
                    elements.add(items[i]);
                }

                Order order = new Order();

                order.setCustomerName(items[0]);

                order.setDish(new MyDish(items[1], DishType.valueOf(items[2]),Boolean.parseBoolean(items[3]),
                        Boolean.parseBoolean(items[4]),Boolean.parseBoolean(items[5]),Boolean.parseBoolean(items[6]),
                        (items[7])));

                orders.add(order);
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
    public int getNumberOrders(List<Order> orderList) {
        return orderList.size();
    }

    @Override
    public Order getOrder(List<Order> orderList, int orderIndex) {
        return orderList.get(orderIndex);
    }

    @Override
    public String getAllOrdersToString(List<Order> orderList) {
        String result = "";
        for (Object order : orderList){
            result += "     " + order.toString() + "\n";
        }
        return result;
    }

    @Override
    public MyDish getDish(List<MyDish> dishList, int dishIndex) {
        return dishList.get(dishIndex);
    }

    @Override
    public String getAllDishToString(List<MyDish> dishList) {
        String result = "";
        for (Object dishes : dishList) {
            result += "     " + dishes.toString() + "\n";
        }
        return result;
    }

    @Override
    public List<MyDish> getDishesByType(List<MyDish> dishList, String dishType) {
        List<MyDish> result = new ArrayList<>();

        for (MyDish dish : dishList) {
            if (dishType.equals(dish.getDishType().toString())) {
                result.add(dish);
            }
        }
        return result;
    }

    @Override
    public List<MyDish> getDishesByFeature(List<MyDish> dishList, String feature) {
        List<MyDish> result = new ArrayList<>();

        for (MyDish dish : dishList) {
            if (dish.isSeafoodFree() && feature.equals("seafoodFree")) {
                result.add(dish);
            } else if (dish.isHalalMeat() && feature.equals("halalMeat")) {
                result.add(dish);
            } else  if (dish.isVegetarian() && feature.equals("vegetarian")) {
                result.add(dish);
            } else if (dish.isGlutenFree() && feature.equals("glutenFree")) {
                result.add(dish);
            }
        }
        return result;
    }

    @Override
    public String getStatsByDishType(List<MyDish> dishList, String dishType) {

        List<MyDish> filteredList = new ArrayList<>();

        for (MyDish dish : dishList) {
            if (dishType.equals(dish.getDishType().toString())) {
                filteredList.add(dish);
            }
        }
        return String.valueOf((float) filteredList.size()/dishList.size());
    }
}
