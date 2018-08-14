package association;

/**
 * @author tristesse08
 */
public class Wheel {

    private double pressure;
    private boolean isPressureLow;
    private String brand;
    private int size;

    public Wheel(double pressure, String brand, int size) {
        this.pressure = pressure;
        this.brand = brand;
        this.size = size;
    }

    public Wheel(double pressure, boolean isPressureLow, String brand, int size) {
        super();
        this.pressure = pressure;
        this.isPressureLow = isPressureLow;
        this.brand = brand;
        this.size = size;
    }

    public String toString() {
        return "Wheel [pressure=" + pressure + ", isPressureLow="
                + isPressureLow + ", brand=" + brand + ", size=" + size + "]";
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public boolean isPressureLow() {
        return isPressureLow;
    }

    public void setPressureLow(boolean isPressureLow) {
        this.isPressureLow = isPressureLow;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
