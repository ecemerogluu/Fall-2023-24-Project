package src;
public class City {
    private String name;
    private double latitude;
    private double longitude;

    public City(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public double distanceTo(City otherCity) {
        double xDistance = Math.abs(this.latitude - otherCity.getX());
        double yDistance = Math.abs(this.longitude - otherCity.getY());
        return Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return latitude;
    }

    public double getY() {
        return longitude;
    }
}
