class Animal {
    public Animal() {
        System.out.println("Animal is created");

    }
    public void eat() {
        System.out.println("Eating something");
    }
}

class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Dog is created");
    }

    public void eat() {
        System.out.println("Eating bread");
    }

    public void bark() {
        System.out.println("Barking");
    }

    public void work() {
        super.eat();
        this.eat();
        this.bark();
    }
}

public class ExampleOnSuper {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.work();
    }
}
