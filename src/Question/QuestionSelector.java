package Question;

import java.util.List;

public interface QuestionSelector {
    List<Question> select(List<Question> questions);
}
