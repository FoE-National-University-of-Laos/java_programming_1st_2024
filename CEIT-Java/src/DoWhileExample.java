public class DoWhileExample {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 20);

        System.out.println("The last Count is: " + count);
    }
}
