package homework1;

public class CapOfAmericano extends CapOfTea{
    CapOfAmericano(String name, Double cost, Double volume, Integer temperature){
        super(name, cost, volume, temperature);
    }
    @Override
    public String toString() {
        return "Напиток - " +
                "название : "+super.getName()+
                " цена : "+super.getCost()+" рублей"+
                " объем : " + super.getVolume() +" литра"+
                " температура : " + super.getTemperature() +" градусов";
    }
}
