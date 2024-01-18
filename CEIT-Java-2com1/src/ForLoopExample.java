public class ForLoopExample {
//    create dummy object array of customers with phone number and their names
    static String[][] customers = {
            {"+639123456789", "Juan Dela Cruz"},
            {"+639987654321", "John Doe"},
            {"+639123123123", "Jane Doe"},
            {"+639456456456", "John Smith"},
            {"+639789789789", "Jane Smith"},
            {"+639321321321", "Juan Tamad"},
            {"+639654654654", "John Wick"},
            {"+639987987987", "Jane Wick"},
            {"+639147147147", "Juan Tamad"},
            {"+639258258258", "John Cena"},
            {"+639369369369", "Jane Cena"},
            {"+639147258369", "Juan Dela Cruz"},
            {"+639258369147", "John Doe"},
            {"+639369147258", "Jane Doe"},
            {"+639147369258", "John Smith"},
            {"+639258147369", "Jane Smith"},
            {"+639369258147", "Juan Tamad"},
            {"+639147369147", "John Wick"},
            {"+639258369258", "Jane Wick"},
            {"+639369147369", "Juan Tamad"},
            {"+639147258369", "John Cena"},
            {"+639258369147", "Jane Cena"},
            {"+639369147258", "Juan Dela Cruz"},
            {"+639147369258", "John Doe"},
            {"+639258147369", "Jane Doe"},
            {"+639369258147", "John Smith"},
            {"+639147369147", "Jane Smith"},
            {"+639258369258", "Juan Tamad"},
            {"+639369147369", "John Wick"},
            {"+639147258369", "Jane Wick"},
            {"+639258369147", "Juan Tamad"},
            {"+639369147258", "John Cena"},
            {"+639147369258", "Jane Cena"},
            {"+639369369369", "Juan Dela Cruz"},
            {"+639147147147", "John Doe"},
            {"+639258258258", "Jane Doe"},
            {"+639369369369", "John Smith"},
            {"+639147147147", "Jane Smith"},
            {"+639258258258", "Juan Tamad"}};
    public static void main(String[] args) {

        for (int i = 0; i < customers.length; i++) {
            sendSMS(customers[i][1], customers[i][0]);
        }



    }

    static void sendSMS(String message, String phoneNumber) {
        System.out.println("Sending SMS to " + phoneNumber + ", Happy new year!, " + message);
    }
}
