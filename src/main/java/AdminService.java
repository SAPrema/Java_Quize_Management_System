
    import java.util.Scanner;

    public class AdminService {
        private static Scanner scanner = new Scanner(System.in);

        public static void handleAdminOperations(User admin) {
            System.out.println("Welcome " + admin.getUsername() + "! Please create new questions in the question bank.");

            String choice;
            do {
                addNewQuestion();
                System.out.println("Do you want to add more questions? (press 's' to start, 'q' to quit)");
                choice = scanner.nextLine().toLowerCase();
            } while (!choice.equals("q"));

            System.out.println("Thank you for adding questions to the question bank!");
        }

        private static void addNewQuestion() {
            System.out.println("Input your question");
            String questionText = scanner.nextLine();

            System.out.println("Input option 1:");
            String option1 = scanner.nextLine();

            System.out.println("Input option 2:");
            String option2 = scanner.nextLine();

            System.out.println("Input option 3:");
            String option3 = scanner.nextLine();

            System.out.println("Input option 4:");
            String option4 = scanner.nextLine();

            int answerKey;
            while (true) {
                try {
                    System.out.println("What is the answer key? (1-4)");
                    answerKey = Integer.parseInt(scanner.nextLine());
                    if (answerKey >= 1 && answerKey <= 4) {
                        break;
                    } else {
                        System.out.println("Please enter a valid option number (1-4)");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number (1-4)");
                }
            }

            Question question = new Question(questionText, option1, option2, option3, option4, answerKey);
            FileManager.addQuestion(question);
            System.out.println("Saved successfully!");
        }
    }
