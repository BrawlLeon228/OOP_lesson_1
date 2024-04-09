package OOP.lesson1;

public class HotDrink extends BottleOfWater{

    private int temperature;

    public HotDrink(int cost, String name, int volume, int temperature) {
        super(cost, name, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    @Override
    public String toString() {
        return "Product{" + "cost=" + cost + ", name=" + name + ", volume=" + volume + ", temperature=" + temperature + "}";
    }
}
