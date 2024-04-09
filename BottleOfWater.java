package OOP.lesson1;

public class BottleOfWater extends Product{

    protected int volume;

    public BottleOfWater(int cost, String name, int volume) {
        super(cost, name);
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }
    @Override
    public String toString() {
        return "Product{" + "cost=" + cost + ", name=" + name + ", volume=" + volume + "}";
    }
}
