package ru.itgirl.jdbcspringexamplenew3.bookController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.jdbcspringexamplenew3.BookRepository.Book;
import ru.itgirl.jdbcspringexamplenew3.BookRepository.BookRepository;

import java.util.List;

    @RestController
    public class BookController {

        @Autowired
        private BookRepository bookRepository;

        public BookController(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }

        @GetMapping("/book")
        public List<Book> getAllBooks(@RequestParam(value = "id", defaultValue = "null") int id){

            return bookRepository.findTheBookFromId(id);
        }

    }