package nl.niranjan.jee.model;

import lombok.Data;

import javax.enterprise.context.RequestScoped;

@Data
@RequestScoped
public class Publisher {
    private long id;
    private String name;
    private String address;
}
