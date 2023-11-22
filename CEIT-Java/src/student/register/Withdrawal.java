package student.register;
import student.exam.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Withdrawal {
    public static void main(String[] args) {
//        Grades grades = new Grades();
//        System.out.println(grades.calculateGrade(100));
//        Points points = new Points();
//        System.out.println(points.calculatePoints(75));
        String s;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader in= new  BufferedReader(ir);
        System.out.print("Enter yourtext here :");
        try{
            s=in.readLine();
            System.out.println("Your text is "+s);
        }catch(IOException e){
            System.out.println("Read input keybroad error");
        }

    }
}
