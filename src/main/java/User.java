public class User {
    private int userID;
    private String name;
    private String address;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int userID, String name, String address) {
        this.userID = userID;
        this.name = name;
        this.address = address;
    }
}
