
class Calculator {
    
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat is meowing");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.5, 2.5));
        System.out.println(calculator.add(1, 2.5));

        System.out.println("==================================");

        Animal animal1 = new Dog();
        animal1.sound();

        Animal animal2 = new Cat();
        animal2.sound();
    }
    
}
