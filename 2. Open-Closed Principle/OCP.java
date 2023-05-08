/* the module should be open for extension but closed for modification. */

class VehicleInfo {
    public void vehicleNumber() {
        System.out.println("Vehicle Number.");
    }
}

class Car extends VehicleInfo {
    public void vehicleNumber() {
        System.out.println("Car Number.");
    }
}

class Truck extends VehicleInfo {
    public void vehicleNumber() {
        System.out.println("Truck Number");
    }
}

class OCP {
    public static void main(String[] args) {

        Car c = new Car();
        c.vehicleNumber();

        Truck t = new Truck();
        t.vehicleNumber();
    }
}