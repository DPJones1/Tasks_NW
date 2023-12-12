package services;

import userInfoProgram.User;
    public class UserDetailsService {
        private User user1 = new User(1, "Abraham Ama", 30000);
        private User user2 = new User(2, "Bob Button", 50000);
        private User user3 = new User(3, "Carol Carter", 20000);
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
