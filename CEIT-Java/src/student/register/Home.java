package student.register;

import student.exam.Grade;

public class Home {
    public static void main(String[] args) {
        Grade grade = new Grade();
        System.out.println(grade.calculate(80));
    }
}
