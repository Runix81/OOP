package homework1;

import java.util.List;

public interface VendingMachine {
    HotDrink getHotDrink(String name) throws IllegalStateException;
    boolean addHotDrink(List<HotDrink> hotDrinksList);


}
