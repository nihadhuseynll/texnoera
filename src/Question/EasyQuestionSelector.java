package Question;

import java.util.ArrayList;
import java.util.List;

public class EasyQuestionSelector implements QuestionSelector {
    @Override
    public List<Question> select(List<Question> questions) {
        List<Question> result = new ArrayList<>();
        for (Question q : questions) {
            if (q.getDifficultyLevel() >= 1 && q.getDifficultyLevel() <= 3) {
                result.add(q);
            }
        }
        return result;
    }
}
