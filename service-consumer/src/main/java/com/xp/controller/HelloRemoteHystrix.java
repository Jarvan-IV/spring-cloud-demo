package com.xp.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloRemoteHystrix.
 *
 * @author xiapeng on 2020-02-02 18:21.
 * @version 1.0
 */
@Component
public class HelloRemoteHystrix implements FeginRemoteInterface {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this messge send failed ";
    }
}
