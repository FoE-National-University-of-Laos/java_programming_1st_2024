class Print {
    // Method to print an integer
    void show(int i) {
        System.out.println("Printing integer: " + i);
    }

    // Method to print a string
    void show(String s) {
        System.out.println("Printing string: " + s);
    }

    // Method to print a double
    void show(double d) {
        System.out.println("Printing double: " + d);
    }
}

public class OOPExamplePolimorphism {
    public static void main(String[] args) {
        Print printer = new Print();

        printer.show(5);         // Calls the method with int argument
        printer.show("Hello");  // Calls the method with String argument
        printer.show(5.5);      // Calls the method with double argument
    }
}
