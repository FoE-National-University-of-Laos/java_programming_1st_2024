public class ForLoopExample {
    public static void main(String[] args) {

        // create array of dummy phone numbers
        String[] phoneNumbers = {"08123456789", "08123456788", "08123456787", "08123456786", "08123456785", "08123456784", "08123456783", "08123456782", "08123456781", "08123456780"};
        // loop through the array and send SMS to each phone number
        for (int i = 0; i < phoneNumbers.length; i++) {
            sendSMS(phoneNumbers[i]);
            if (phoneNumbers[i] == "08123456785") {
                System.out.println("This is my phone number :)");
            }
        }

        // create full Christmas tree with for loop
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int treeHeight = 10;

        for (int i = 0; i < treeHeight; i++) {
            // Print spaces
            for (int j = 0; j < treeHeight - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the trunk
        for (int i = 0; i < treeHeight - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

    }

    public static void sendSMS(String tel){
        System.out.println("Sending SMS to " + tel + "...");
    }
}
