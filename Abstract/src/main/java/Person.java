import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * Constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Add vehicle.
     */
    public void addVehicle(Vehicle newVehicle) {
        vehicleList.add(newVehicle);
    }

    /**
     * Remove vehicle.
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber() == registrationNumber) {
                vehicleList.remove(vehicle);
                return;
            }
        }
    }

    /**
     * Get vehicle info
     */
    public String getVehiclesInfo() {
        String list = "";
        if (vehicleList.size() == 0) {
            list = getName() + " has nos vehicle!";
        } else {
            list = getName() + " has:\n\n\n";
            for (Vehicle vehicle : vehicleList) {
                list += vehicle.getInfo() + "\n";
            }
        }
        return list;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
