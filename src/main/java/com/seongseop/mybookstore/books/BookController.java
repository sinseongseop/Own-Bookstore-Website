package com.seongseop.mybookstore.books;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    BookService bookservice;

    public BookController(BookService bookservice) {
        this.bookservice = bookservice;
    }

    @GetMapping("/books")
    public String showAllBooks(Model model){
        List<BookDTO> books  = bookservice.findAllBook();
        model.addAttribute("books",books);
        return "book";
    }



}
