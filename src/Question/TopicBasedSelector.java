package Question;

import java.util.ArrayList;
import java.util.List;

public class TopicBasedSelector implements QuestionSelector {
    private String topic;

    public TopicBasedSelector(String topic) {
        this.topic = topic;
    }

    @Override
    public List<Question> select(List<Question> questions) {
        List<Question> result = new ArrayList<>();
        for (Question q : questions) {
            if (q.getTopic().equalsIgnoreCase(topic)) {
                result.add(q);
            }
        }
        return result;
    }
}
