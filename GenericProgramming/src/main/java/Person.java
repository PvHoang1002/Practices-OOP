public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /**
     * Constructor.
     */
    public Person() {

    }

    /**
     * Constructor.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sort.
     */
    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) == 0) {
            return this.age - person.age;
        } else {
            return this.name.compareTo(person.name);
        }
    }
}
