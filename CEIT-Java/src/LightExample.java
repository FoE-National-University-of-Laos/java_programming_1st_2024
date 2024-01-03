class LightExample {

    //  These are attributes of the class
    static String model;
    static String color;
    static private int power;
    static int size;
    static private int state;
    static int brightness;

    public LightExample() {
        model = "Philips";
        color = "White";
        power = 100;
        size = 10;
        state = 0;
        brightness = 0;

        System.out.println("Constructor called!");
    }

    // These are methods of the class
    static void turnOn() {
        state = 1;
        System.out.println("Turn on the light!");
    }

    static void turnOff() {
        state = 0;
        System.out.println("Turn off the light!");
    }

    static void changeBrightness(int brightness) {
        System.out.println("Change brightness to " + brightness);
    }

    static int changeBrightness(int brightness, int duration) {
        System.out.println("Change brightness to " + brightness + " for " + duration + " seconds");
        return brightness;
    }

    static void changeColor(String color) {
        System.out.println("Change color to " + color);
    }

    // this is the main method
    public static void main(String[] args) {
        System.out.println("This is my light!");
        LightExample light = new LightExample(); // create an object
        light.turnOn();
        light.changeBrightness(50);
    }
}
