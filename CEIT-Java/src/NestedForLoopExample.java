public class NestedForLoopExample {
    public static void main(String[] args) {
//        for (int i = 2; i <= 10; i++) {
//            for (int j = 1; j <= 12; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            System.out.println("----------");
//        }

//        for loop for a chrismas tree with root
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <= 15 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(" ");
            }
            System.out.println("****");
        }


    }
}
