
    import java.util.Scanner;

    public class QuizManagementSystem {
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("=".repeat(60));
            System.out.println("           WELCOME TO QUIZ MANAGEMENT SYSTEM");
            System.out.println("=".repeat(60));


            FileManager.readUsers();

            while (true) {
                User loggedInUser = login();

                if (loggedInUser != null) {
                    if (AuthService.isAdmin(loggedInUser)) {
                        AdminService.handleAdminOperations(loggedInUser);
                    } else if (AuthService.isStudent(loggedInUser)) {
                        QuizService.handleStudentQuiz(loggedInUser);
                    }
                }

                System.out.println("\nDo you want to continue? (y/n)");
                String continueChoice = scanner.nextLine().toLowerCase();
                if (continueChoice.equals("n")) {
                    break;
                }
            }

            System.out.println("Thank you for using Quiz Management System!");
            scanner.close();
        }

        private static User login() {
            System.out.println("\n" + "-".repeat(30));
            System.out.println("           LOGIN");
            System.out.println("-".repeat(30));

            System.out.println("Enter your username");
            String username = scanner.nextLine();

            System.out.println("Enter password");
            String password = scanner.nextLine();

            User user = AuthService.authenticateUser(username, password);

            if (user == null) {
                System.out.println("Invalid credentials! Please try again.");
                return null;
            }

            return user;
        }
    }

