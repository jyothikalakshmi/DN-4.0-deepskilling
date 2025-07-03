package com.library;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String args[]){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bs= (BookService) context.getBean("bookService");
        BookRepository br=(BookRepository) context.getBean("bookRepository");
        br.print();
        bs.greet()
    }
}
