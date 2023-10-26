class EncapsulatedPerson {
    private String name;
    private int age;
    public String nickname = "John";

    // Constructor
    public EncapsulatedPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class OOPExample {
    public static void main(String[] args) {
        EncapsulatedPerson person = new EncapsulatedPerson("John", 20);
        System.out.println(person.nickname);
        System.out.println("Hello world!");
        System.out.println("I am " + person.getAge() + " years old.");
    }
}
