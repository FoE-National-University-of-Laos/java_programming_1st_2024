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

public class EncapsulationExample {
    public static void main(String[] args) {
        EncapsulatedPerson person = new EncapsulatedPerson("Savath", 24);
        System.out.println(person.getName());
        System.out.println(person.nickname);
    }

}
