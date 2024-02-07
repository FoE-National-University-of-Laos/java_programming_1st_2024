public class ForLoopExample {
    public static void main(String[] args) {

//        for (int i = 1; i <= 20; i++) {
//             System.out.println("i is " + i);
//        }

        int LaosPhoneNo[] = {202020, 202021, 202022, 202023, 202024, 202025, 202026, 202027, 202028, 202029};
        System.out.println("LaosPhoneNo.length: " + LaosPhoneNo.length);
        
        for (int i = 0; i < LaosPhoneNo.length; i++) {
            if (LaosPhoneNo[i]== 202022) {
                System.out.println("Found 202022 at index: " + i);
                continue;
            }
            sendSMS(String.valueOf(LaosPhoneNo[i]));
        }

    }

    // send sms function
    public static void sendSMS(String tel) {
        System.out.println("Sending SMS to : " + tel + " ...");
    }
}
