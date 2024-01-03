public class LightBulb {
    // these are the attributes of the light bulb class
    static String color;
    static int watts;
    static boolean indicator;
    static int brightness;
    static private int state;
    static String model;
    static String brand;
    static String type;
    static String shape;
    static String size;

    public LightBulb() {
        System.out.println("A light bulb has been created.");
    }

    // these are the methods of the light bulb class
    public static void turnOn() {
        state = 1;
        System.out.println("The light bulb is on.");
    }

    public static void turnOff() {
        state = 0;
        System.out.println("The light bulb is off.");
    }

    public static void adjustBrightness(int brightness) {
        System.out.println("The brightness is " + brightness + ".");
    }

    // this is the main method
    public static void main(String[] args) {
        System.out.println("This is my light bulb!");
        turnOn();
    }
}
