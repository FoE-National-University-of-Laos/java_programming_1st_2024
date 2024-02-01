import java.util.Arrays;

public class ArrayExample {
    static String studentNames[] = {"Juan", "Pedro", "Maria", "Juana", "John", "Jane"};
    public static void main(String[] args) {
        studentNames[1] = "Pedro Jr.";
        System.out.println(Arrays.toString(studentNames));
    }
}
