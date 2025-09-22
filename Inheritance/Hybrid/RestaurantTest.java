
interface Worker {

    void performDuties();
}

class Person {

    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking food.");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class RestaurantTest {

    public static void main(String[] args) {
        Worker[] workers = {new Chef("Alice", 1), new Waiter("Bob", 2)};
        for (Worker w : workers) {
            w.performDuties();
        }
    }
}
