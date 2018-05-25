package nl.niranjan.jee.model;

import lombok.Data;

import javax.enterprise.context.RequestScoped;
import java.util.Date;

@Data
@RequestScoped
public class Member {
    private long id;
    private String name;
    private Date memberDate;
    private String memberType;
    private String address ;
    private Date expiryDate;
}
