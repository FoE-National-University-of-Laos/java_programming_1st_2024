public class ArrayExample {
    public static void main(String[] args) {
        String animals[] = {"Dog", "Cat", "Lion", "Tiger", "Elephant"};
        animals[3] = "Rabbit";
//        System.out.println(animals[3]);

        String fruits[][] = {
            {"Apple", "Orange", "Banana"},
            {"Pineapple", "Mango", "Pawpaw"},
            {"Grapes", "Watermelon", "Strawberry"},
                {"Peach", "Pear", "Guava"}
        };

        System.out.println(fruits[2][1].length());
        System.out.println(fruits[2].length);

    }
}
