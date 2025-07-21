public class Book {
    private String title;
    private int pageCount;
    private Author author;
    private static int totalBooks = 0;

    public Book(String title, int pageCount, Author author) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        totalBooks++; // hər kitab yaradıldıqda artır
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void printBook() {
        System.out.println("Book: " + title);
        System.out.println("Pages: " + pageCount);
        System.out.println("Author: " + author.getName());
        System.out.println();
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}
