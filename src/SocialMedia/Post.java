package SocialMedia;

import java.util.ArrayList;

public class Post implements Content {
    private String author;
    private String text;
    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public void addComment(Comment comment) {
        for (Comment c : comments) {
            if (c.getText().equals(comment.getText()) && c.getAuthor().equals(comment.getAuthor())) {
                System.out.println("Duplicate comment not allowed.");
                return;
            }
        }
        comments.add(comment);
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
        System.out.println(indent + "Post by " + author + ": \"" + text + "\"");
        for (Comment comment : comments) {
            comment.display(indent + "  ");
        }
    }
}
