package com.springserverless;

import com.springserverless.persistence.model.Book;
import com.springserverless.web.BookController;
import com.springserverless.web.SimpleController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;


@Import({
    Book.class, BookController.class, SimpleController.class
})
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    // silence console logging
    @Value("${logging.level.root:OFF}")
    String message = "";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


