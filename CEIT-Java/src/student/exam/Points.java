package student.exam;

public class Points {
    private String calculatePoints(double points) {
        if (points < 50)
            return "Failed";
        return "Passed! Congratulations!";
    }

    public static void main(String[] args) {
        Points points = new Points();
        System.out.println("Your grade is ");
        System.out.println(points.calculatePoints(75));
    }
}
