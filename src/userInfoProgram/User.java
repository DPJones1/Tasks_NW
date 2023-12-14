package userInfoProgram;


public class User {
    private int id;
    private String name;
    private ContactDetails contactDetails;

    public User(int id, String name, ContactDetails contactDetails) {
        this.id = id;
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void printUserDetails() {
        System.out.println("user id: " + id + " name: " + name + " telephone: " + contactDetails.getTelephone() + " address: " + contactDetails.getAddress() + " email: " + contactDetails.getEmail());
    }
}



   /* @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        User otherUser = (User) obj;

        return id == otherUser.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    } */




