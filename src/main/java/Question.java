public class Question {
        private String question;
        private String option1;
        private String option2;
        private String option3;
        private String option4;
        private int answerkey;

        // Default constructor
        public Question() {}

        // Parameterized constructor
        public Question(String question, String option1, String option2, String option3, String option4, int answerkey) {
            this.question = question;
            this.option1 = option1;
            this.option2 = option2;
            this.option3 = option3;
            this.option4 = option4;
            this.answerkey = answerkey;
        }

        // Getters and Setters
        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getOption1() {
            return option1;
        }

        public void setOption1(String option1) {
            this.option1 = option1;
        }

        public String getOption2() {
            return option2;
        }

        public void setOption2(String option2) {
            this.option2 = option2;
        }

        public String getOption3() {
            return option3;
        }

        public void setOption3(String option3) {
            this.option3 = option3;
        }

        public String getOption4() {
            return option4;
        }

        public void setOption4(String option4) {
            this.option4 = option4;
        }

        public int getAnswerkey() {
            return answerkey;
        }

        public void setAnswerkey(int answerkey) {
            this.answerkey = answerkey;
        }

        @Override
        public String toString() {
            return "Question{" +
                    "question='" + question + '\'' +
                    ", option1='" + option1 + '\'' +
                    ", option2='" + option2 + '\'' +
                    ", option3='" + option3 + '\'' +
                    ", option4='" + option4 + '\'' +
                    ", answerkey=" + answerkey +
                    '}';
        }
    }
