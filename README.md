# 📚 Quiz Management System

A simple **Java-based** quiz application where:
- **Admins** can add multiple-choice questions
- **Students** can take 10-question quizzes
- Data is stored in **JSON** files

---

##  Features

###  Admin
- Login as admin
- Add new questions (4 options, 1 correct answer)
- Save questions to a `quiz.json` file

###  Student
- Login as student
- Take a quiz of 10 random questions
- Get instant score and feedback
- Retake the quiz anytime

---

## 🛠️ How to Run

1. Open the project in **IntelliJ IDEA**
2. Ensure you have **Java 11** or newer installed
3. Run the file: `QuizManagementSystem.java`
4. Login using one of the following default credentials:

### 🔐 Default Login Credentials

#### Admin Login (to add questions)
- **Username**: `admin`
- **Password**: `1234`

#### Student Login (to take quiz)
- **Username**: `salman`
- **Password**: `1234`

---

## 📂 Files Created

| File         | Description                          |
|--------------|--------------------------------------|
| `users.json` | Stores login credentials             |
| `quiz.json`  | Stores all quiz questions            |

---

## 🧠 Score Feedback System

| Score Range | Feedback Message                     |
|-------------|---------------------------------------|
| 8 – 10      |  **Excellent!**                     |
| 5 – 7       |  **Good.**                          |
| 3 – 4       |  **Very poor!**                    |
| 0 – 2       |  **Very sorry, you are failed.**    |

---

## 💻 Technologies Used

- **Java**
- **Gson** (Google's JSON library)
- **IntelliJ IDEA**

---

## 📘 SQA Topics Covered

The quiz questions focus on:
- Types of Testing
- Software Testing Principles
- Black-box & White-box Testing
- Test Case Design Techniques




