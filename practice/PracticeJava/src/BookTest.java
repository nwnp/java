// 객체를 생성하고 사용하는 방법에 대해서

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        b.author = "JIN";
        b.title = "JAVA";
        b.price = 30000;
        b.company = "JC";
        b.page = 700;
        b.isbn = "ISBN-113443u1";
        System.out.println(b.title + "\t" + b.author + "\t" + b.price  + "\t" + b.company + "\t" + b.page + "\t" + b.isbn);
    }
}
