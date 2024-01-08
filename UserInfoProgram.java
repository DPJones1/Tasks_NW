package userInfoProgram;

import services.UserDetailsService;

import java.util.Scanner;

public class UserInfoProgram {

    public static void main(String[] args) {
        UserDetailsService userDetailsService = new UserDetailsService();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            if (args.length < 2 || !args[0].equals("user")) {
                System.out.println("Please provide valid user id or type 'users' for all, or exit");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else if (input.equals("users")) {
                    userDetailsService.displayAllUsers();
                } else if (input.startsWith("user ")) {
                    try {
                        int inputUserId = Integer.parseInt(input.substring("user ".length()));
                        userDetailsService.displayUserInfo(inputUserId);
                    } catch (NumberFormatException | IndexOutOfBoundsException e) {
                        System.out.println("Invalid input");
                    }
                } else {
                    System.out.println("Invalid input");
                }
            }

        }

        scanner.close();
    }
}