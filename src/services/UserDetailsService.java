package services;

import userInfoProgram.ContactDetails;
import userInfoProgram.User;




    public class UserDetailsService {

        private ContactDetails contact1 = new ContactDetails("0161222111", "Manchester", "Ama@gmail.com");
        private ContactDetails contact2 = new ContactDetails("0124211111", "Cheltenham", "Button@gmail.com");
        private ContactDetails contact3 = new ContactDetails("0111959111", "London", "Carter@gmail.com");


        private User user1 = new User(1, "Abraham Ama", contact1);
        private User user2 = new User(2, "Bob Button", contact2);
        private User user3 = new User(3, "Carol Carter", contact3);
        User[] users = {user1, user2, user3};

    public void displayAllUsers1() {
        user1.printUserDetails();
        user2.printUserDetails();
        user3.printUserDetails();
}

    public void displayAllUsers() {
        for (User user: users) {
            user.printUserDetails();
        }
    }
    public void displayUserInfo(int userId) {
        boolean isValidUserId = false;

        int i = 0;
        while (i < users.length) {
            User user = users[i];
            if (userId == user.getId()) {
                isValidUserId = true;
                user.printUserDetails();

                break;
            }

            i++;
        }

        if (!isValidUserId) {
            System.out.println("The id is invalid");
        }
    }
}
