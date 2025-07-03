package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public void addBook(String bookName){
        System.out.println("BookService- add book : "+bookName);
        bookRepository.saveBook(bookName);
    }
}
