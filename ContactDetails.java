package userInfoProgram;



public class ContactDetails {
    private String telephone;
    private String address;
    private String email;

    public ContactDetails(String telephone, String address, String email) {
        this.telephone = telephone;
        this.address = address;
        this.email = email;

    }

    public void setTelephone (String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}