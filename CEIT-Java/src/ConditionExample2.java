public class ConditionExample2 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin123";


        if (username == "admin" && password=="admin123") {
            System.out.println("Username and Password is correct");
        } else if (username == "" || password == "") {
            System.out.println("Username and Password is empty");
        } else {
            System.out.println("Username and Password is incorrect");
        }
    }
}
