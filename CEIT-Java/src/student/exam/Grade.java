package student.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade {
    public String calculate(int point) {
        if (point >= 80) {
            return "A";
        } else if (point >= 70) {
            return "B";
        } else if (point >= 60) {
            return "C";
        } else if (point >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        String s;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(ir);
        System.out.print("Please enter your withdraw amount:");
        try{
            s=in.readLine();
            System.out.println("You have withdrawn " + s + " KIP");
        }catch(IOException e){
            System.out.println("Read input keybroad error");
        }

    }
}
