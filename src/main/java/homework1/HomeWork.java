package homework1;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        CapOfTea capOfTea = new CapOfTea("Горячий чай", 30.00, 0.200, 90);
        CapOfAmericano capOfAmericano = new CapOfAmericano("Американо", 40.00, 0.200, 80);
        System.out.println(capOfTea.toString());
        System.out.println(capOfAmericano.toString());
        System.out.println("--------------------------------------");
        List<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(capOfTea);
        hotDrinks.add(capOfAmericano);
        CapOfTeaVendingMachine vendingMachine = new CapOfTeaVendingMachine(hotDrinks);
        System.out.println(vendingMachine.getHotDrink("Американо"));
        System.out.println(vendingMachine.getHotDrink("Капучино"));
        System.out.println(vendingMachine.getHotDrink("Горячий чай"));
    }
}
