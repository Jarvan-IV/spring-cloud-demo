package com.xp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController.
 *
 * @author xiapeng on 2019-08-15 20:37
 */

@RestController
public class UserController {

    @RequestMapping("/{name}")
    public String getUser(@PathVariable("name") String name) {
        return "hello，" + name + "，这是provider-2 提供的信息";
    }
}
