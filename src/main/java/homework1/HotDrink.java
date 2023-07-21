package homework1;

public abstract class HotDrink {
    private String name;
    private Double cost;

    public HotDrink(String name, Double cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
