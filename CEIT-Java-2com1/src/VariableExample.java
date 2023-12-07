public class VariableExample {
    static String StudentEmailAddress; // Camel Case
    static String student_name; // Snake case

    void test(){
        String student_name = "";
        // student_name can be used only in this method test()

    }

    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.turnOff();
    }

}
