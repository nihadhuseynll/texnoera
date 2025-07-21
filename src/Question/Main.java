package Question;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        QuestionSelector easyQuestionSelector = new EasyQuestionSelector();
        QuestionSelector randomSelector = new RandomSelector();
        QuestionSelector topicBasedSelector = new TopicBasedSelector("math");
        List<Question> questions = Arrays.asList(
                new Question("What is Java?", 2, "programming"),
                new Question("Solve 2+2", 1, "math"),
                new Question("Explain polymorphism.", 5, "programming"),
                new Question("What is 3.14?", 2, "math"),
                new Question("What is inheritance?", 4, "programming"),
                new Question("What is a prime number?", 3, "math"),
                new Question("Explain interfaces.", 6, "programming")
        );

        System.out.println("Easy Questions:");
        System.out.println(easyQuestionSelector.select(questions));

        System.out.println("Random Questions:");
        System.out.println(randomSelector.select(questions));;

        System.out.println("Math Questions:");
        System.out.println(topicBasedSelector.select(questions));
    }
}
