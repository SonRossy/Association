package association;

/**
 * @author tristesse08
 */
public class Seat {

    private String material;
    private String filler;
    private String brand;
    private String suitableSeason;
    private boolean isInfantSafe;
    private boolean isHeated;

    public Seat(String material, String filler, String brand, String suitableSeason, boolean isInfantSafe, boolean isHeated) {
        this.material = material;
        this.filler = filler;
        this.brand = brand;
        this.suitableSeason = suitableSeason;
        this.isInfantSafe = isInfantSafe;
        this.isHeated = isHeated;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSuitableSeason() {
        return suitableSeason;
    }

    public void setSuitableSeason(String suitableSeason) {
        this.suitableSeason = suitableSeason;
    }

    public boolean isIsInfantSafe() {
        return isInfantSafe;
    }

    public void setIsInfantSafe(boolean isInfantSafe) {
        this.isInfantSafe = isInfantSafe;
    }

    public boolean isIsHeated() {
        return isHeated;
    }

    @Override
    public String toString() {
        return "Seat{" + "material=" + material + ", filler=" + filler + ", brand=" + brand + ", suitableSeason=" + suitableSeason + ", isInfantSafe=" + isInfantSafe + ", isHeated=" + isHeated + '}';
    }

    public void setIsHeated(boolean isHeated) {
        this.isHeated = isHeated;
    }

    public void adjustHeight(int level) {
        System.out.println("adjusting height");
    }

    public void pullForward() {
        System.out.println("pulling forward");
    }

    public void pushBack() {
        System.out.println("pusshing back");
    }
}
