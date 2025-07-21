package Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomSelector implements QuestionSelector {
    @Override
    public List<Question> select(List<Question> questions) {
        List<Question> copy = new ArrayList<>(questions);
        Collections.shuffle(copy);

        List<Question> result = new ArrayList<>();
        int limit = Math.min(3, copy.size());

        for (int i = 0; i < limit; i++) {
            result.add(copy.get(i));
        }
        return result;
    }
}
