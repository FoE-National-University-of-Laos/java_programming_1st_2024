package student.exam;

public class Points {
    private String calculatePoints(int points) {
        if (points < 50) {
            return "failed";
        } else {
            return "passed";
        }
    }
    public static void main(String[] args) {
        Points points = new Points();
        System.out.println(points.calculatePoints(40));
    }
}
