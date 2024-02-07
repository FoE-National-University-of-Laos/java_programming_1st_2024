public class ArrayExample {
    public static void main(String[] args) {
//        String animals[] = {"Dog", "Cat", "Horse", "Elephant", "Lion"};
//        animals[3] = "Tiger";
//        System.out.println(animals[3]);

        String animals[][] = {
            {"Dog", "Cat", "Horse", "Elephant", "Lion"},
            {"Tiger", "Lion", "Bear", "Wolf", "Fox"},
            {"Penguin", "Polar Bear", "Seal", "Whale", "Dolphin"},
                {"Eagle", "Hawk", "Falcon", "Owl", "Vulture"}
        };

        System.out.println(animals[3][0]);
    }
}
