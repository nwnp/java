public class ObjectArray {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0] = new Book();
        b[1] = new Book();
        b[2] = new Book();
        b[0].title = "BOOK";
        b[1].author = "author";
        b[2].isbn = "ISBN-345930fjd";
        System.out.println(b[0].title);
        System.out.println(b[1].author);
        System.out.println(b[2].isbn);
    }
}
