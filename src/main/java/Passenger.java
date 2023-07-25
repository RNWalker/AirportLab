public class Passenger {

    private String name;
    private int phoneNumber;
    private int uniqueID;

    public Passenger(String name, int phoneNumber, int uniqueID) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return this.name;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getUniqueID() {
        return this.uniqueID;
    }
}
