public class Array2DExample {
    public static void main(String[] args) {
        // Declaring and initializing a 2D array with initial values
        int[][] myArray = {
                {1, 2, 6, 9, 10},
                {3, 4, 12, 13, 16},
                {5, 6, 9, 20, 23},
                {7, 8, 10, 25, 30}
        };

        System.out.println("myArray.length: " + myArray[2][3]);

        // Printing the 2D array
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
