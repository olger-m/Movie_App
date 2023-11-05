import Service.MovieService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MovieService movieService = new MovieService();
        movieService.getmoviebyname("Ted");
    }
}
