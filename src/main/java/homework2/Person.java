package homework2;

public abstract class Person implements PersonBehaviour{

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Person() {

    }

    String getName(){
        return this.name;
    }

    public Person(String name){
        this.name = name;
    }

}
