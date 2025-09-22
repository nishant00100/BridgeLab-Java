
class Animal {

    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

public class AnimalHierarchyTest {

    public static void main(String[] args) {
        Animal[] animals = {new Dog("Rex", 5), new Cat("Misty", 3), new Bird("Tweety", 1)};
        for (Animal a : animals) {
            System.out.print(a.name + " says: ");
            a.makeSound();
        }
    }
}
