package userInfoProgram;

public class UserList implements List {
    public int currentPosition;
    public User[] users = new User[100];

    public UserList() {
        this.currentPosition = 0;

    }

    @Override
    public void add(User user) {
        users[currentPosition] = user;
        currentPosition = currentPosition +1;
    }

    @Override
    public void remove(User user) {

    }

    @Override
    public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return currentPosition;
    }
}
