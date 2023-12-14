package userInfoProgram;


public class Employee extends User {
    private String job;
    private double salary;

    public Employee(int id, String name, ContactDetails contactDetails, String job, double salary) {
        super(id, name, contactDetails);
        this.job = job;
        this.salary = salary;

    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    //public void printUserDetails() {
    //    super.printUserDetails();
     //   System.out.println("user id: " + id + " name: " + name + " telephone: " + contactDetails.getTelephone() + " address: " + contactDetails.getAddress() + " email: " + contactDetails.getEmail());
    //}


}
