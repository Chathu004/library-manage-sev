package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.entity.BookEntity;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
@CrossOrigin
public class BookController {

   final BookService service;
   @PostMapping("/add")
//   maintain your code for readability
//   maintain for every method
   @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }
    @GetMapping("/get")
    public Iterable<BookEntity> getBook(){
       return service.getBook();
    }
    @DeleteMapping("/{id}")
//    public String deleteBook(@PathVariable Long id){
//        if (service.deleteBook(id)) {
//            return "deleted";
//        }else{
//            return "not deleted";
//        }
    @ResponseStatus(HttpStatus.OK)
    public String  deleteBook(@PathVariable Long id){
       service.deleteBook(id);
       return "Deleted";

    }
    @GetMapping("search/{id}")
    public Book getBookId(@PathVariable Long id){
       return service.getBookId(id);
    }
}
