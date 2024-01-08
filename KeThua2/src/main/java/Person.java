public class Person {
    private String name;
    private String address;

    /**
     * Constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * To string.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
