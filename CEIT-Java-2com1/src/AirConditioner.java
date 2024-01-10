import java.util.Timer;

public class AirConditioner {
    // these are attributes of the AirConditioner class
    static private String brand;
    static String model;
    static String color;
    static int size;
    static int temperature;
    static int state;

    static Timer timer;

    // constructor
    public AirConditioner() {
        brand = "Toshiba";
        model = "ABC123";
        color = "White";
        size = 1;
        temperature = 25;
        state = 0;
        System.out.println("Air Conditioner is created");
    }

    // these are methods of the AirConditioner class
    static void turnOn() {
        state = 1;
        temperature = 25;
        System.out.println("Air Conditioner is turned on");
    }

    static private void turnOff() {
        state = 0;
        System.out.println("Air Conditioner is turned off");
    }

    static void increaseTemperature() {
        temperature++;
        System.out.println("Temperature is increased to " + temperature);
    }

    static void decreaseTemperature() {
        temperature--;
        System.out.println("Temperature is decreased to " + temperature);
    }

    static private void showStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Temperature: " + temperature);
        System.out.println("State: " + state);
    }

    static void setTimer(int seconds) {
        timer = new Timer();
        System.out.println("Timer is set to " + seconds + " seconds");
    }


    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.brand = "Toshiba";
        ac.model = "ABC123";
        ac.turnOn();
        ac.increaseTemperature();
    }
}
