import java.util.List;


    public class AuthService {


        public static User authenticateUser(String username, String password) {
            List<User> users = FileManager.readUsers();

            for (User user : users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return user;
                }
            }
            return null; // Authentication failed
        }


        public static boolean isAdmin(User user) {
            return user != null && "admin".equals(user.getRole());
        }

       
        public static boolean isStudent(User user) {
            return user != null && "student".equals(user.getRole());
        }
    }

