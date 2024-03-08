package ru.itgirl.jdbcspringexamplenew3.BookRepository;


import java.util.List;

public interface BookRepository {
    List<Book> findTheBookFromId (int id);
    }

