package Question;

public class Question {
    private String text;
    private int difficultyLevel;
    private String topic;

    public Question(String text, int difficultyLevel, String topic) {
        this.text = text;
        this.difficultyLevel = difficultyLevel;
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", difficultyLevel=" + difficultyLevel +
                ", topic='" + topic + '\'' +
                '}';
    }
}
