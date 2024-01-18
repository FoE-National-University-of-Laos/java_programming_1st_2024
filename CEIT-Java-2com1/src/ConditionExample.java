public class ConditionExample {
    public static void main(String[] args) {
        int year = 1970;
//        condition for people generation
        if (year >= 1996) {
            System.out.println("You are a Gen Z");
        } else if (year >= 1981) {
            System.out.println("You are a Y");
        } else if (year >= 1965) {
            System.out.println("You are a Gen X");
        } else if (year >= 1946) {
            System.out.println("You are a Baby Boomer");
        } else {
            System.out.println("You are a Silent Generation");
        }
    }
}
