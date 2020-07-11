package org.song.Control;

import org.song.Component.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//111111
///11111
//222222
@RestController
public class BookController {
    @Autowired
    Book book;
    @GetMapping("/book")
    public String book(){
        return book.toString();
    }
}
