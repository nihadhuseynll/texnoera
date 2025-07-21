//package encapsulation;
//
//class Library {
//    String name;
//    Book[] books;
//    int count;
//
//    public Library(String name) {
//        this.name = name;
//        this.books = new Book[5];
//        this.count = 0;
//    }
//
//    public void addBook(Book book) {
//        if (count < books.length) {
//            books[count] = book;
//            count++;
//        } else {
//            System.out.println("Cannot add more books.");
//        }
//    }
//
//    public void printAllBooks() {
//        System.out.println("Library: " + name);
//        for (int i = 0; i < count; i++) {
//            books[i].printBookInfo();
//        }
//    }
//}
