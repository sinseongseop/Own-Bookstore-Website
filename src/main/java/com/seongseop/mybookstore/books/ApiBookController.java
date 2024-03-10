package com.seongseop.mybookstore.books;

import com.seongseop.mybookstore.errors.BookNameMissMatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiBookController {
    BookService bookservice;

    public ApiBookController(BookService bookservice) {
        this.bookservice = bookservice;
    }

    @GetMapping("/books")
    public List<BookDTO> showAllBooks(){
        return bookservice.findAllBook();
    }

    @PostMapping("/books/{bookname}")
    public ResponseEntity<BookDTO> addNewBook(@PathVariable("bookname") String bookname, @RequestBody BookDTO bookDTO ){
        if(bookname.equals(bookDTO.getTitle())){
            BookDTO created= bookservice.saveBook(bookDTO);
            return ResponseEntity.status(HttpStatus.OK).body(created);
        }else{
            throw new BookNameMissMatchException("url과 책이름이 매치 되지 않습니다.");
        }
    }
}
