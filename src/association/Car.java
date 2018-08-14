package association;

/**
 * @author tristesse08
 */
public class Car {

    private Wheel wheels;
    private Engine engine;
    private Seat seats;

    @Override
    public String toString() {
        return "Car{" + "wheels=" + wheels + ", engine=" + engine + ", seats=" + seats + '}';
    }

    Car(Engine e, Wheel w, Seat s) {
        this.engine = e;
        this.wheels = w;
        this.seats = s;
    }

    /*
	 * public Engine(double cylinderCapacity, String engineType,
			int numberOfCylinders, double horsePower) {
     */
    public static void main(String[] args) {

        Car c = new Car(new Engine(1.8, "Petrol", 5, 250), new Wheel(34.5, "Tata", 24), new Seat("leather", "cottton", "ironCon", "nice", true, true));
        System.out.println(c);
        System.out.println(c.wheels.getBrand());
        c.engine.start();
    }

}
