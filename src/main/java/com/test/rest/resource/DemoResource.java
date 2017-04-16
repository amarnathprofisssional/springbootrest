package com.test.rest.resource;

import com.test.jpa.entity.User;
import com.test.jpa.repository.UserDao;
import com.test.rest.dto.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by amar on 4/16/2017.
 */
@Component
@Path("/api/demo")
@Transactional
public class DemoResource {

    @Autowired
    private UserDao userDao;

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String helloMessage() {
        return "Hello World Jersey Way!";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addUser(Customer customer){
        User user=new User();
        BeanUtils.copyProperties(customer,user);
        user= (User) userDao.save(user);
        BeanUtils.copyProperties(user,customer);
        return Response.ok().entity(customer).build();
    }
}
