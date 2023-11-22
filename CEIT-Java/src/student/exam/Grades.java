package student.exam;

public class Grades {
    public String calculateGrade(double points) {
        if (points < 50)
            return "F";
        else if (points < 60)
            return "D";
        else if (points < 70)
            return "D+";
        else if (points < 80)
            return "C";
        else if (points < 90)
            return "B";
        else
            return "A";
    }
}
