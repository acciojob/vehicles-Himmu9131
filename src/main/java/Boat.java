import com.driver.WaterVehicle;

public class Boat implements WaterVehicle {
        private String boat="titanic";
        private int capacity=2000;


    public String getBoat() {
        return boat;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return getBoat();
    }

    @Override
    public int getVehicleCapacity() {
        return getCapacity();
    }
}
