public class BreakContExample {
    public static void main(String[] args) {
        // create array of dummy phone numbers
        String[] phoneNumbers = {"08123456789", "0202222222", "08123456787", "08123456786", "08123456785", "08123456784", "08123456783", "08123456782", "08123456781", "08123456780"};
        // loop through the array and send SMS to each phone number
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == "0202222222") {
                break;
            }
            System.out.println("Sending SMS to " + phoneNumbers[i] + "...");
        }

    }
}
