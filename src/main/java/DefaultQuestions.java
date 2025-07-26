import java.util.ArrayList;
import java.util.List;

    public class DefaultQuestions {

        public static void initializeDefaultQuestions() {
            List<Question> questions = FileManager.readQuestions();


            if (questions.isEmpty()) {
                List<Question> defaultQuestions = createSQAQuestions();
                FileManager.writeQuestions(defaultQuestions);
                System.out.println("Default SQA questions have been added to the question bank.");
            }
        }

        private static List<Question> createSQAQuestions() {
            List<Question> questions = new ArrayList<>();

            questions.add(new Question(
                    "Which is not part of system testing?",
                    "Regression Testing",
                    "Sanity Testing",
                    "Load Testing",
                    "Unit Testing",
                    4
            ));

            questions.add(new Question(
                    "What does SQA stand for?",
                    "Software Quality Assurance",
                    "System Quality Analysis",
                    "Software Quantity Assessment",
                    "System Quick Access",
                    1
            ));

            questions.add(new Question(
                    "Which testing is performed first?",
                    "Integration Testing",
                    "System Testing",
                    "Unit Testing",
                    "Acceptance Testing",
                    3
            ));

            questions.add(new Question(
                    "What is the main purpose of regression testing?",
                    "To test new features",
                    "To ensure existing functionality still works after changes",
                    "To test system performance",
                    "To test user interface",
                    2
            ));

            questions.add(new Question(
                    "Which is a black box testing technique?",
                    "Statement Coverage",
                    "Branch Coverage",
                    "Boundary Value Analysis",
                    "Path Coverage",
                    3
            ));

            questions.add(new Question(
                    "What is the difference between verification and validation?",
                    "No difference",
                    "Verification checks if we built the right product, validation checks if we built the product right",
                    "Verification checks if we built the product right, validation checks if we built the right product",
                    "Both are the same process",
                    3
            ));

            questions.add(new Question(
                    "Which testing level comes after unit testing?",
                    "System Testing",
                    "Integration Testing",
                    "Acceptance Testing",
                    "Performance Testing",
                    2
            ));

            questions.add(new Question(
                    "What is a test case?",
                    "A bug found during testing",
                    "A set of conditions to determine if a system works correctly",
                    "A testing tool",
                    "A type of software",
                    2
            ));

            questions.add(new Question(
                    "Which is NOT a type of functional testing?",
                    "Smoke Testing",
                    "Sanity Testing",
                    "Load Testing",
                    "User Acceptance Testing",
                    3
            ));

            questions.add(new Question(
                    "What is the main goal of testing?",
                    "To prove the software works",
                    "To find and fix all bugs",
                    "To find defects and ensure quality",
                    "To delay the release",
                    3
            ));

            questions.add(new Question(
                    "Which document describes what to test?",
                    "Test Plan",
                    "Test Case",
                    "Test Report",
                    "Test Strategy",
                    1
            ));

            questions.add(new Question(
                    "What is alpha testing?",
                    "Testing by end users",
                    "Testing by developers",
                    "Internal testing by organization",
                    "Automated testing",
                    3
            ));

            questions.add(new Question(
                    "What is beta testing?",
                    "Internal testing",
                    "Testing by selected external users",
                    "Automated testing",
                    "Performance testing",
                    2
            ));

            questions.add(new Question(
                    "Which is a white box testing technique?",
                    "Equivalence Partitioning",
                    "Boundary Value Analysis",
                    "Statement Coverage",
                    "Error Guessing",
                    3
            ));

            questions.add(new Question(
                    "What is the purpose of smoke testing?",
                    "To test all functionalities",
                    "To verify basic functionality works",
                    "To test performance",
                    "To test security",
                    2
            ));

            questions.add(new Question(
                    "Which is NOT a software testing principle?",
                    "Testing shows presence of defects",
                    "Exhaustive testing is impossible",
                    "Testing can prove software is bug-free",
                    "Early testing saves time and money",
                    3
            ));

            questions.add(new Question(
                    "What is boundary value analysis?",
                    "Testing at the boundaries of input domains",
                    "Testing random values",
                    "Testing only valid inputs",
                    "Testing system limits",
                    1
            ));

            questions.add(new Question(
                    "Which testing focuses on data flow?",
                    "Control flow testing",
                    "Data flow testing",
                    "Boundary testing",
                    "Stress testing",
                    2
            ));

            questions.add(new Question(
                    "What is equivalence partitioning?",
                    "Dividing inputs into groups that should behave similarly",
                    "Testing all possible inputs",
                    "Random testing approach",
                    "Testing only boundary values",
                    1
            ));

            questions.add(new Question(
                    "Which is a non-functional testing type?",
                    "Unit Testing",
                    "Integration Testing",
                    "Performance Testing",
                    "System Testing",
                    3
            ));

            return questions;
        }
    }

