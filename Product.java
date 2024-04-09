package OOP.lesson1;

import JAVA.program;

public class Product {
    protected int cost;

    protected String name;

    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }
    
    public int getCost() {
        return this.cost;
    }
    public String getName() {
        return this.name;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setCost(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Product{" + "cost=" + cost + ", name=" + name + "}";
    }
}
