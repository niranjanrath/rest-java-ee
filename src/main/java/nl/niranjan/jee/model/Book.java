package nl.niranjan.jee.model;

import lombok.Builder;
import lombok.Data;

import javax.enterprise.context.RequestScoped;

@Data
@Builder
@RequestScoped
public class Book {
    private long id;
    private String author;
    private String title;
    private double price;
    private boolean available;
}
