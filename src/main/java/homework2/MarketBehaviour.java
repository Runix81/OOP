package homework2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Person person);
    void releaseFromMarket(List<Person> list);
    void update();
}
