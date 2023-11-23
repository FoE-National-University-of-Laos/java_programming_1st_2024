package student.exam;

public class Grade {
    public String calculateGrade(int points) {
        if (points < 50) {
            return "F";
        } else if (points < 60) {
            return "D";
        } else if (points < 70) {
            return "C";
        } else if (points < 80) {
            return "B";
        } else if (points < 90) {
            return "B+";
        } else {
            return "A";
        }
    }
    public static void main(String[] args) {

    }
}
