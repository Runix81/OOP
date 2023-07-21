package homework1;

import java.util.List;

public class CapOfTeaVendingMachine implements VendingMachine{
    private List<HotDrink> hotDrinks;
    public CapOfTeaVendingMachine(List<HotDrink> hotDrinks){
        this.hotDrinks = hotDrinks;
    }
    public HotDrink getHotDrink(String name){
        for (HotDrink hotDrink: hotDrinks) {
            if(hotDrink.getName().equalsIgnoreCase(name)){
                return hotDrink;
            }
        }
        throw new IllegalStateException(String.format("Горячий напиток с названием %s не найден", name));
    }

    @Override
    public boolean addHotDrink(List<HotDrink> hotDrinksList) {
        if (hotDrinks==null && hotDrinksList==null){
            return false;
        }
        for (HotDrink drinks : hotDrinksList) {
            hotDrinks.add(drinks);
        }
        return true;
    }
}
