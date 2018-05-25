package nl.niranjan.jee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("test")
public class TestEndPoint {

    @GET
    @Produces({"text/plain"})
    @Path("/hello")
    public String listPaperBooks() {
        return "Hello World !!";
    }

}
