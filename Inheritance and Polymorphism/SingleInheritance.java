class Vehicle {
    String type;
    public Vehicle(String type) {
        this.type = type;
    }
}
class Car extends Vehicle{
    int wheels;
    public Car(String type, int wheels) {
        super(type);
        this.wheels = wheels;
    }
    public void startEngine() {
        System.out.println(this.type + " starts with " + this.wheels + " wheels");
    }

    public static void main(String[] args) {
        Car c1 = new Car("Manual", 4);
        c1.startEngine();
        Car c2 = new Car("Automatic", 4);
        c2.startEngine();
    }

}