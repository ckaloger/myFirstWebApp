package fwa.controllers;

import br.com.caelum.vraptor.*;
import fwa.data.Book;
import fwa.data.BookDAO;
//import com.rsaraiva.labs.vraptor4.model.Event;
//import com.rsaraiva.labs.vraptor4.service.EventService;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;


@Controller
public class BooksController implements Serializable {

    @Inject
    private BookDAO dao;

    @Inject
    private Result result;



    @Post("/books")
    public void add(Book book) {
        System.out.println("inside booksController method add");
//        System.out.println("add");
//        System.out.println(mymail.getUsername()+ "" + mymail.getPassword() + "" + mymail.getMailTo() + "" + mymail.getMessage());
//        service.sendMail(mymail);
        dao.persist(book);
        result.include("books",dao.listAll());
        result.forwardTo("/WEB-INF/jsp/books/list.jsp");

    }
    @Path("/books/remove/{book.id}/{book.title}/{book.description}")
    public void remove (Book book){
        System.out.println("inside controller remove");
        dao.remove(book);
        result.include("books",dao.listAll());
        result.forwardTo("/WEB-INF/jsp/books/list.jsp");
    }
    @Post("/books/update/{book.id}")
    public void update(Book book){
        dao.update(book);
        result.include("books",dao.listAll());
        result.forwardTo("/WEB-INF/jsp/books/list.jsp");
    }

    @Path("/books/updateScreen/{book.id}")
    public void updateScreen(Book book){
        result.include("book", dao.find(book.getId()));
        result.forwardTo("/WEB-INF/jsp/books/update.jsp");
    }

    @Get("/")
    public void list(){
        System.out.println("inside booksController method list");
        //result.include("books", dao.listAll());
       // return dao.listAll();
        result.include("books",dao.listAll());
    }
    @Path("/books/{book.id}")
    @Get
    public void show(Book book){
        result.include("book", dao.find(book.getId()));
        System.out.println("inside show controller " + book.getTitle() + " " + book.getDescription());
        //You can redirect to any page if you like.
        result.forwardTo("/WEB-INF/jsp/books/view.jsp");
    }
}