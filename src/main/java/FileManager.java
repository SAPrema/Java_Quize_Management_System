
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

    public class FileManager {
        private static final Gson gson = new Gson();
        private static final String USERS_FILE = "users.json";
        private static final String QUIZ_FILE = "quiz.json";

        // Read users from JSON file
        public static List<User> readUsers() {
            try (FileReader reader = new FileReader(USERS_FILE)) {
                Type userListType = new TypeToken<List<User>>(){}.getType();
                List<User> users = gson.fromJson(reader, userListType);
                return users != null ? users : new ArrayList<>();
            } catch (IOException e) {
                System.out.println("Users file not found. Creating default users...");
                return createDefaultUsers();
            }
        }

        // Write users to JSON file
        public static void writeUsers(List<User> users) {
            try (FileWriter writer = new FileWriter(USERS_FILE)) {
                gson.toJson(users, writer);
            } catch (IOException e) {
                System.out.println("Error writing users file: " + e.getMessage());
            }
        }


        private static List<User> createDefaultUsers() {
            List<User> defaultUsers = new ArrayList<>();
            defaultUsers.add(new User("admin", "1234", "admin"));
            defaultUsers.add(new User("sumaiyea", "1234", "student"));

            writeUsers(defaultUsers);
            return defaultUsers;
        }


        public static List<Question> readQuestions() {
            try (FileReader reader = new FileReader(QUIZ_FILE)) {
                Type questionListType = new TypeToken<List<Question>>(){}.getType();
                List<Question> questions = gson.fromJson(reader, questionListType);
                return questions != null ? questions : new ArrayList<>();
            } catch (IOException e) {
                System.out.println("Quiz file not found. Creating empty question bank...");
                return new ArrayList<>();
            }
        }


        public static void writeQuestions(List<Question> questions) {
            try (FileWriter writer = new FileWriter(QUIZ_FILE)) {
                gson.toJson(questions, writer);
            } catch (IOException e) {
                System.out.println("Error writing quiz file: " + e.getMessage());
            }
        }

        public static void addQuestion(Question question) {
            List<Question> questions = readQuestions();
            questions.add(question);
            writeQuestions(questions);
        }
    }

