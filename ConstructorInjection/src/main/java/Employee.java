public class Employee {

    private Address address;
    int id;

    public Employee(Address address) {
        this.address = address;
        System.out.println("Address constructor");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", id=" + id +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        System.out.println("setter");
    }
}
