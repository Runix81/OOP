package homework1;

public class CapOfTea extends HotDrink{
    private Double volume;
    private Integer temperature;
    public CapOfTea(String name, Double cost, Double volume, Integer temperature){
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;

    }
    public void setVolume(Double volume){
        this.volume = volume;
    }
    public Double getVolume(){
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Напиток - " +
                "название : "+super.getName()+
                " цена : "+super.getCost()+" рублей"+
                " объем : " + this.volume +" литра"+
                " температура : " + this.temperature +" градусов";
    }
}
