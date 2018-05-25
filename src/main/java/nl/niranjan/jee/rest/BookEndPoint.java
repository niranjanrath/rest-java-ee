package nl.niranjan.jee.rest;


import nl.niranjan.jee.model.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("books")
public class BookEndPoint {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Book> getBooks() {
        List<Book> list = new ArrayList<>();
        list.add(Book.builder().id(1).author("Niranjan").available(false).price(10.56).title("test title").build());
        return list;
    }
}
