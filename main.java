package OOP.lesson1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new HotDrink(111, "Tea", 200, 90));
        productList.add(new HotDrink(222, "Tea", 400, 110));
        productList.add(new HotDrink(333, "Coffee", 200, 90));
        productList.add(new HotDrink(444, "Coffee", 400, 110));

        VendingMachineOfHotDrinks vendingMachine = new VendingMachineOfHotDrinks();
        vendingMachine.initProduct(productList);

        System.out.println(vendingMachine.getProduct("Tea", 400, 110));
        System.out.println(vendingMachine.getProduct("Tea", 200, 110));
        System.out.println(vendingMachine.getProduct("Coffee", 400, 110));

    }
}
