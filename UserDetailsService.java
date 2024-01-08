package services;

import userInfoProgram.ContactDetails;
import userInfoProgram.User;
import userInfoProgram.UserList;


public class UserDetailsService {

    private ContactDetails contact1 = new ContactDetails("0161222111", "Manchester", "Ama@gmail.com");
    private ContactDetails contact2 = new ContactDetails("0124211111", "Cheltenham", "Button@gmail.com");
    private ContactDetails contact3 = new ContactDetails("0111959111", "London", "Carter@gmail.com");


        private User user1 = new User(1, "Abraham Ama", contact1);
        private User user2 = new User(2, "Bob Button", contact2);
        private User user3 = new User(3, "Carol Carter", contact3);

        private UserList userList = new UserList();

        public UserDetailsService() {
            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
        }


    public void displayAllUsers() {
        for (User user : userList.users) {
            if (user != null) {
                user.printUserDetails();
            }
        }
    }
    public void displayUserInfo(int userId) {
                for (User user : userList.users) {
                    if (user != null && user.getId() == userId) {
                        user.printUserDetails();
                        return;
                    }

                }

                System.out.println("Invalid Id");


    }
}