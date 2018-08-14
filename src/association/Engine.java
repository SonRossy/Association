package association;

/**
 *
 * @author tristesse08
 */
public class Engine {

    private double cylinderCapacity;
    private String engineType;
    private int numberOfCylinders;
    private double horsePower;

    public Engine(double cylinderCapacity, String engineType,
            int numberOfCylinders, double horsePower) {

        this.cylinderCapacity = cylinderCapacity;
        this.engineType = engineType;
        this.numberOfCylinders = numberOfCylinders;
        this.horsePower = horsePower;
    }

    public String toString() {
        return "Engine [cylinderCapacity=" + cylinderCapacity + ", engineType="
                + engineType + ", numberOfCylinders=" + numberOfCylinders
                + ", horsePower=" + horsePower + "]";
    }

    public void start() {
        System.out.println("Starting engine");
    }

    public void stop() {
        System.out.println("Stopping engine");
    }

    public void accelerate() {
        System.out.println("Increase speed");
    }

    public void brake() {
        System.out.println("Reduce speed");
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

}
