package SocialMedia;

import java.util.ArrayList;

public class PostManager {
    private ArrayList<Post> posts = new ArrayList<>();

    public void addPost(Post post) {
        posts.add(post);
    }

    public ArrayList<Post> findPostsByAuthor(String author) {
        ArrayList<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (post.getAuthor().equalsIgnoreCase(author)) {
                result.add(post);
            }
        }
        return result;
    }

    public void displayAllPosts() {
        for (Post post : posts) {
            post.display("");
        }
    }
}
