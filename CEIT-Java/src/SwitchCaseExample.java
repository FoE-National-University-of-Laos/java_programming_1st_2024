public class SwitchCaseExample {
    public static void main(String[] args) {
        int grade = 1;
        switch (grade){
            case 1:
                System.out.println("You are in grade A");
                break;
            case 2:
                System.out.println("You are in grade B");
                break;
            case 3:
                System.out.println("You are in grade C");
                break;
            default:
                System.out.println("Your Grade is not available");
        }
    }
}
