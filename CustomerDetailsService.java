package services;

import userInfoProgram.ContactDetails;
import userInfoProgram.User;
import userInfoProgram.UserList;
import userInfoProgram.Customer;

public class CustomerDetailsService {
    private ContactDetails contact1 = new ContactDetails("0161222111", "Manchester", "Ama@gmail.com");
    private ContactDetails contact2 = new ContactDetails("0124211111", "Cheltenham", "Button@gmail.com");
    private ContactDetails contact3 = new ContactDetails("0111959111", "London", "Carter@gmail.com");


    private Customer customer1 = new Customer(1, "Abraham Ama", contact1);
    private Customer customer2 = new Customer(2, "Bob Button", contact2);
    private Customer customer3 = new Customer(3, "Carol Carter", contact3);

    private UserList customerList = new UserList();

    public CustomerDetailsService() {
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
    }

    public void displayAllCustomers() {
        for (User user : customerList.users) {
            if (user != null && user instanceof Customer) {
                Customer customer = (Customer) user;
                customer.printUserDetails();
            }
        }
    }
    public void displayCustomerInfo(int customerId) {
        for (User user : customerList.users) {
            if (user != null && user instanceof Customer && user.getId() == customerId) {
                Customer customer = (Customer) user;
                customer.printUserDetails();
                return;
            }
        }

        System.out.println("Invalid Id");

    }

}
