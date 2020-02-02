package com.xp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ConsumerController.
 *
 * @author xiapeng on 2019-08-15 21:12
 */

@RestController
public class ConsumerController {

    @Autowired
    private FeginRemoteInterface feginRemoteInterface;

    @RequestMapping("test")
    public String getFromProvider(){
        return new RestTemplate().getForObject("http://localhost:9010/xp",String.class);
    }

    @RequestMapping("/fegin/{name}")
    public String getUserByFegin(@PathVariable("name") String name) {
        return "这是 通过feigin 调用的接口：" + feginRemoteInterface.hello(name);
    }
}
