public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructor.
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    /**
     * Get info.
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + super.getBrand() + "\n"
                + "\tModel: " + super.getModel() + "\n"
                + "\tRegistration Number: " + super.getRegistrationNumber() + "\n"
                + "\tHas Side Car: " + this.isHasSidecar() + "\n"
                + "\tBelongs to " + super.getOwner().getName()
                + " - " + super.getOwner().getAddress();
    }

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
