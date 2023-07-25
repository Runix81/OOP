package homework2;

import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        Market market = new Market();
        Person person1 = new Human("Вася");
        Person person2 = new Human("Катя");
        market.acceptToMarket(person1);
        market.acceptToMarket(person2);
        market.update();
        market.releaseFromQueue();

    }
}
