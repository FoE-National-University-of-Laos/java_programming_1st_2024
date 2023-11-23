import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String username = "admin";
    static String password = "admin";
    public static void main(String[] args) {
        String s;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(ir);
        System.out.print("Enter yourtext here :");
        try{
            s=in.readLine();
            System.out.println("Your text is "+s);
        }catch( IOException e){
            System.out.println("Read input keybroad error");
        }

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login \nsuccessful!");
        } else {
            System.out.println("Login failed!");
        }
    }
}