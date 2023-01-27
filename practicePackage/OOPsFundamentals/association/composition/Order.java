package practicePackage.OOPsFundamentals.association.composition;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> items;
     
     public Order(){
        items = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> add(String name,double cost){
        items.add(new OrderItem(name, cost));
        return items;
    }
    public static void display(Order order){
        for (OrderItem item : order.items) {
              System.out.println(item.getName() + " "+ item.getCost());
        }
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.add("soap", 5);
        order.add("pen", 10);
        order.display(order);
    }
}
