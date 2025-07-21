package SocialMedia;

import java.util.ArrayList;

public class Comment implements Content {
    private String author;
    private String text;
    private ArrayList<Comment> replies = new ArrayList<>();
    private Gender gender;

    public Comment(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public void addReply(Comment reply) {
        for (Comment c : replies) {
            if (c.getText().equals(reply.getText()) && c.getAuthor().equals(reply.getAuthor())) {
                System.out.println("Duplicate reply not allowed.");
                return;
            }
        }
        replies.add(reply);
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Comment by " + author + ": \"" + text + "\"");
        for (Comment reply : replies) {
            reply.display(indent + "  ");
        }
    }
}
