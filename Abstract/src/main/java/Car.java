public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors  = numberOfDoors;
    }

    /**
     * Get info.
     */
    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + super.getBrand() + "\n"
                + "\tModel: " + super.getModel() + "\n"
                + "\tRegistration Number: " + super.getRegistrationNumber() + "\n"
                + "\tNumber of Doors: " + this.getNumberOfDoors() + "\n"
                + "\tBelongs to " + super.getOwner().getName()
                + " - " + super.getOwner().getAddress();
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
