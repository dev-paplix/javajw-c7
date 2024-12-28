public class Encapsulation {
    private String name;
    private int age;

    //Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Ahmad Zahier");
        encapsulation.setAge(27);
        System.out.println("Name: " + encapsulation.getName());
        System.out.println("Age: " + encapsulation.getAge());
    }
}
