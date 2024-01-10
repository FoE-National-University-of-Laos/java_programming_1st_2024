public class ConditionExample {
    public static void main(String[] args) {
        int year = 1982;
        // Baby Boomers: Born 1946-1964
        // Generation X: Born 1965-1980
        // Millennials Y: Born 1981-1996
        // Generation Z: Born 1997-2012
        if (year >= 1946 && year <= 1964) {
            System.out.println("You are a Baby Boomer!");
        } else if (year >= 1965 && year <= 1980) {
            System.out.println("You are a Generation X!");
        } else if (year >= 1981 && year <= 1996) {
            System.out.println("You are a Millennial Y!");
        } else if (year >= 1997 && year <= 2012) {
            System.out.println("You are a Generation Z!");
        } else if (year >= 2013) {
            System.out.println("You are a Generation Alpha!");
        } else if (year <= 1945) {
            System.out.println("You are a Silent Generation!");
        } else {
            System.out.println("You are not a Baby Boomer, Generation X, Millennial Y, or Generation Z!");
        }
    }
}
