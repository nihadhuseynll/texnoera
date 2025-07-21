package SocialMedia;

public class Main {
    public static void main(String[] args) {
        PostManager manager = new PostManager();

        Post post1 = new Post("Alice", "Today is a beautiful day!");
        Comment comment1 = new Comment("Bob", "Yes, absolutely!");
        Comment reply1 = new Comment("Charlie", "I agree with Bob.");
        comment1.addReply(reply1);

        Comment comment2 = new Comment("David", "Where are you now?");
        post1.addComment(comment1);
        post1.addComment(comment2);

        manager.addPost(post1);

        Post post2 = new Post("Bob", "Who's coming to the match?");
        manager.addPost(post2);

        manager.displayAllPosts();

        System.out.println(Gender.MALE.getValue());


    }
}
