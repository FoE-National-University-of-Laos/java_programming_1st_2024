class Vehicle {
    void move() {
        System.out.println("The vehicle moves.");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car drives.");
    }

//    move backward for car method
    void moveBackward() {
        System.out.println("The car moves backward.");
    }
}

class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("The boat sails.");
    }

}
