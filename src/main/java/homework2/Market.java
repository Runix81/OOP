package homework2;

import java.util.ArrayList;
import java.util.List;

public class Market extends Person implements QueueBehaviour, MarketBehaviour{
    private final List<Person> queue;

    public Market(){
        super();
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Person person){
        System.out.println(person.getName() + " встал(а) в очередь.");
        this.queue.add(person);
    }
    @Override
    public void takeOrders(){
        for (Person person: queue) {
            if(!person.isMakeOrder()){
                person.setMakeOrder(true);
                System.out.println(person.getName() + " сделал(а) заказ.");
            }
        }
    }
    @Override
    public void giveOrders(){
        for (Person person : queue) {
            if (person.isMakeOrder()) {
                person.setTakeOrder(true);
                System.out.println(person.getName() + " получил(а) свой заказ.");
            }
        }
    }
    @Override
    public void releaseFromQueue(){
        List<Person> releasedPerson = new ArrayList<>();
        for (Person person: queue) {
            if(person.isTakeOrder()){
                releasedPerson.add(person);
                System.out.println(person.getName() + " выбыл(а) из очереди.");
            }
        }
        releaseFromMarket(releasedPerson);
    }
    @Override
    public void acceptToMarket(Person person){
        System.out.println(person.getName() + " прибыл(а) в магазин.");
        takeInQueue(person);
    }
    @Override
    public void releaseFromMarket(List<Person> persons){
        for (Person person: persons) {
            System.out.println(person.getName() + " покинул(а) из магазина");
            queue.remove(person);
        }
    }
    @Override
    public void update(){
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    String getName() {
        return null;
    }

    @Override
    public void setMakeOrder(boolean status) {

    }

    @Override
    public void setTakeOrder(boolean status) {

    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }
}
