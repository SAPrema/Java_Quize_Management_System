
    import java.util.*;

    public class QuizService {
        private static Scanner scanner = new Scanner(System.in);
        private static final int QUIZ_QUESTIONS_COUNT = 10;

        public static void handleStudentQuiz(User student) {
            String choice;
            do {
                System.out.println("Welcome " + student.getUsername() + " to the quiz! We will throw you " +
                        QUIZ_QUESTIONS_COUNT + " questions. Each MCQ mark is 1 and no negative marking. " +
                        "Are you ready? Press 's' to start.");

                choice = scanner.nextLine().toLowerCase();
                if (choice.equals("s")) {
                    startQuiz();
                }
            } while (!choice.equals("q"));

            System.out.println("Thank you for using the quiz system!");
        }

        private static void startQuiz() {
            List<Question> questionBank = FileManager.readQuestions();

            if (questionBank.isEmpty()) {
                System.out.println("No questions available in the question bank. Please contact admin.");
                return;
            }


            List<Question> quizQuestions = selectRandomQuestions(questionBank, QUIZ_QUESTIONS_COUNT);

            int score = 0;

            for (int i = 0; i < quizQuestions.size(); i++) {
                Question q = quizQuestions.get(i);

                System.out.println("[Question " + (i + 1) + "] " + q.getQuestion());
                System.out.println("1. " + q.getOption1());
                System.out.println("2. " + q.getOption2());
                System.out.println("3. " + q.getOption3());
                System.out.println("4. " + q.getOption4());

                int userAnswer = getUserAnswer();

                if (userAnswer == q.getAnswerkey()) {
                    score++;
                }
            }

            displayResults(score);
        }

        private static List<Question> selectRandomQuestions(List<Question> questionBank, int count) {
            List<Question> selectedQuestions = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < count; i++) {
                int randomIndex = random.nextInt(questionBank.size());
                selectedQuestions.add(questionBank.get(randomIndex));
            }

            return selectedQuestions;
        }

        private static int getUserAnswer() {
            while (true) {
                try {
                    System.out.print("Your answer (1-4): ");
                    int answer = Integer.parseInt(scanner.nextLine());
                    if (answer >= 1 && answer <= 4) {
                        return answer;
                    } else {
                        System.out.println("Please enter a valid option number (1-4)");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number (1-4)");
                }
            }
        }

        private static void displayResults(int score) {
            String message;

            if (score >= 8 && score <= 10) {
                message = "Excellent! You have got " + score + " out of 10";
            } else if (score >= 5 && score <= 7) {
                message = "Good. You have got " + score + " out of 10";
            } else if (score >= 3 && score <= 4) {
                message = "Very poor! You have got " + score + " out of 10";
            } else {
                message = "Very sorry you are failed. You have got " + score + " out of 10";
            }

            System.out.println("\n" + "=".repeat(50));
            System.out.println("QUIZ RESULTS");
            System.out.println("=".repeat(50));
            System.out.println(message);
            System.out.println("=".repeat(50));

            System.out.println("Would you like to start again? Press 's' for start or 'q' for quit");
        }
    }
