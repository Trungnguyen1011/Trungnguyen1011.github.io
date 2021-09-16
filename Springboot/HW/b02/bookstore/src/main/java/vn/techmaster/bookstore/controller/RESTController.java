package vn.techmaster.bookstore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.techmaster.bookstore.model.Book;
import vn.techmaster.bookstore.repository.BookDao;

@RestController

@RequestMapping("/api")
public class RESTController {
  @Autowired
  private BookDao bookDao;

  @GetMapping("/books")
  public ResponseEntity<List<Book>> listBooks(@RequestParam(name = "id") Optional<Integer> id) {
    if (!id.isPresent()) {
      List<Book> books = bookDao.getAll();
      return ResponseEntity.ok().body(books);
    }

    List<Book> books = new ArrayList<Book>();
    books.add(bookDao.getBook(id.get()));
    return ResponseEntity.ok().body(books);

  }

  // @PostMapping("/books")
  // public void postBook(@RequestParam(name = "id", required = false) int id,
  // @RequestParam(name = "title", required = false) String title,
  // @RequestParam(name = "description", required = false) String description) {
  //
  // bookDao.add(new Book(id, title, description));
  // }

  @PostMapping(path = "/books", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public void postBook(Book book) {
    bookDao.add(book);
  }

  @DeleteMapping("/books")
  public void deleteBook(Optional<Integer> id) {
    if (id.isPresent()) {
      try {
        bookDao.deleteByID(id.get());
      } catch (Exception e) {
        System.out.println("Id not found.");
      }

    }
  }

  @PatchMapping("/books")
  public void patchBook(Optional<Integer> id, String title, String description) {

    if (id.isPresent()) {
      try {
        Book temp = bookDao.getBook(id.get());
        if (title != null) {
          temp.setTitle(title);
        }
        if (description != null) {
          temp.setDescription(description);
        }
        bookDao.update(temp);
      } catch (Exception e) {
        System.out.println("Id not found.");
      }
    }
  }

}
