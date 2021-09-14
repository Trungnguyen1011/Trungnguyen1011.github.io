package vn.techmaster.book.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.techmaster.book.model.Book;
import vn.techmaster.book.model.Movie;
@RestController
@CrossOrigin
@RequestMapping("/api")
public class RESTController {

  @GetMapping("/books")
  public ResponseEntity<List<Book>> listBooks() {
    List<Book> books = List.of(
      new Book("Dế Mèn Phiêu Lưu Ký", "Tô Hoài"),
      new Book("Nhật Ký Trong Tù", "Hồ Chí Minh"),
      new Book("Tắt Đèn", "Ngô Tất Tố")
    );
    return ResponseEntity.ok().body(books);
  }
  @GetMapping("/movies")
  public ResponseEntity<List<Movie>> movieList() {
    List<Movie> movies = List.of(
      new Movie("Gone with the Wind", "Victor Fleming, David O. Selznick",1939L),
      new Movie("Bố Già", "Trấn Thành",2020L),
      new Movie("Parasite", "Bong Joon-ho",2019L),
      new Movie("Money Heist", "Álex Pina",2018L)
    );
    return ResponseEntity.ok().body(movies);
  }
}
// "Gone with the Wind" - Victor Fleming, David O. Selznick - 1939
// "Bố Già" - Trấn Thành - 2020
// "Parasite" - Bong Joon-ho - 2019
// "Money Heist" - Álex Pina - 2018