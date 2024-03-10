package com.seongseop.mybookstore.books;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookDTO> findAllBook(){
        return bookRepository.findAll()
                .stream()
                .map(BookDTO::from)
                .collect(Collectors.toList());
    }

    public BookDTO saveBook(BookDTO bookDTO){
        Book created=bookRepository.save(Book.from(bookDTO));
        return BookDTO.from(created);
    }
}
