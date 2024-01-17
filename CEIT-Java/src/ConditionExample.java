public class ConditionExample {
    public static void main(String[] args) {
        calGeneration(1997);
    }

    public static void calGeneration(int birthYear){
        if(birthYear >= 1996){
            System.out.println("Generation Z");
        }else if(birthYear >= 1981){
            System.out.println("Generation Y");
        }else if(birthYear >= 1965){
            System.out.println("Generation X");
        }else if(birthYear >= 1946){
            System.out.println("Baby Boomers");
        }else if(birthYear >= 1928){
            System.out.println("Silent Generation");
        }else{
            System.out.println("Greatest Generation");
        }
    }
}
