package practicePackage.OOPsFundamentals.association.composition;

public class OrderItem {
    private String name;
    private double cost;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public OrderItem(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    
}

