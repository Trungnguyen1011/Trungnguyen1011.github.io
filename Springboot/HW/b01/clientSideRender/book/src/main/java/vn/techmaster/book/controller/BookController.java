package vn.techmaster.book.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.techmaster.book.model.Book;
import vn.techmaster.book.model.Movie;

@Controller
@RequestMapping(value ="/")
public class BookController {
  @GetMapping("/")
  public String showHomePage() {
    return "index";
  }
  @GetMapping("/books")
  public String listBooks(Model model) {
    List<Book> books = List.of(
      new Book("Dế Mèn Phiêu Lưu Ký tập 2", "Tô Hoài"),
      new Book("Nhật Ký Trong Tù", "Hồ Chí Minh"),
      new Book("Tắt Đèn", "Ngô Tất Tố")
    );
    model.addAttribute("books", books);
    return "book";
  }

  @GetMapping("/movies")
  public String movieList(Model model) {
    List<Movie> movies = List.of(
      new Movie("Gone with the Wind", "Victor Fleming, David O. Selznick",1939L),
      new Movie("Bố Già", "Trấn Thành",2020L),
      new Movie("Parasite", "Bong Joon-ho",2019L),
      new Movie("Money Heist", "Álex Pina",2018L)
    );
    model.addAttribute("movies", movies);
    return "movie";
  }
}


