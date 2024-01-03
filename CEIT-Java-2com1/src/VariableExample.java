public class VariableExample {
    static String StudentEmailAddress; // Camel Case
    static String student_name; // Snake case

    void test(){
        String student_name = "";
        // student_name can be used only in this method test()

    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 20;

        if ((x + y > z) && (x - y < z)) {
            x += 5;
        } else {
            x -= 3;
        }

        if (x > 15 || y < 10) {
            z = x * 2;
        } else {
            z = y * 2;
        }

        System.out.println(z);
    }

}
