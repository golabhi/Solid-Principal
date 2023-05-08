/* It applies to inheritance in such a way that the derived classes must be completely substitutable for their base classes.
In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behavior of the program. */

interface Vehicle {

    void turnOnEngine();

    void accelerate();
}

class Car implements Vehicle {
    public void turnOnEngine() {
        System.out.println("Car Engine Start.");
    }

    public void accelerate() {
        System.out.println("Car accelerate.");
    }
}

class Truck implements Vehicle {
    public void turnOnEngine() {
        System.out.println("Truck Engine Start.");
    }

    public void accelerate() {
        System.out.println("Truck accelerate.");
    }
}

class LSP {
    public static void main(String[] args) {

        Car c = new Car();
        c.turnOnEngine();
        c.accelerate();

        Truck t = new Truck();
        t.turnOnEngine();
        t.accelerate();
    }
}