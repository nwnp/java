public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "Avatar";
        movie.day = "2023.06.20";
        movie.major = "Jake Sully";
        movie.genre = "Action";
        movie.time = 192;
        movie.level = 12;
        System.out.println(movie.title);
    }
}
