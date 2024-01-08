package userInfoProgram;


public class Customer extends User {

    public char customerType;

    public Customer(int id, String name, ContactDetails contactDetails) {
        super(id, name, contactDetails);
    }

    public void printUserDetails() {
        System.out.println("user id: " + id + " name: " + name + " telephone: " + contactDetails.getTelephone() + " address: " + contactDetails.getAddress() + " email: " + contactDetails.getEmail());
    }

}
