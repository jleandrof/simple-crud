package com.scrud.controllers;

import com.scrud.model.User;
import com.scrud.services.UserService;
import org.jooby.mvc.*;
import java.util.Map;

/**
 * @author Leandro Silva (22-12-2018)
 */
@Path("/")
public class UserController {

    private UserService userService = new UserService();

    @GET
    @Path("getUsers")
    public Map<String, User> getUsers() {
        return userService.getAllUsers();
    }

    @POST
    @Path("create")
    public User createUser(User user) {
        return userService.createUser(user);
    }

    @PUT
    @Path("update")
    public User updateUser(String id, User user) {
        return userService.updateUser(id, user);
    }

    @DELETE
    @Path("remove")
    public User removeUser(String id) {
        return userService.remove(id);
    }
}