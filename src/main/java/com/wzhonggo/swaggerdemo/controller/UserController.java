package com.wzhonggo.swaggerdemo.controller;


import com.wzhonggo.swaggerdemo.controller.model.User;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wzhonggo on 7/12/2017.
 */
@RestController
@Api(value = "/user", description = "用户")
public class UserController {
    @PostMapping(value = "/user", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ApiOperation(value = "add a user ", response = User.class,notes = "add a user to database")
    @ApiImplicitParams({ @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String", paramType = "query")
    ,@ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query")})


    public User addUser(/*@ApiParam(value = "username", required = true)*/ String username, /*@ApiParam(value = "password", required = true)*/ String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }

    @GetMapping(value = "/user")
    @ApiOperation(value = "get a user by username ", response = User.class,notes = "get a user from database")
    @ApiImplicitParams({ @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "String", paramType = "query")
            })


    public User getUser(/*@ApiParam(value = "username", required = true)*/ String username) {
        User user = new User();
        user.setUsername(username);
        user.setPassword("123456789");
        return user;
    }
}

