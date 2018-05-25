package nl.niranjan.jee.model;

import lombok.Data;

import javax.enterprise.context.RequestScoped;
import java.util.Date;

@Data
@RequestScoped
public class Borrower {
    private Date dueDate;
    private Date returnDate;
    private Date issueDate;
}
