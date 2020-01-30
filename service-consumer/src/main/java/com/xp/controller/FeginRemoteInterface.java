package com.xp.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FeginRemoteInterface.
 *
 * @author xiapeng on 2019-08-18 21:30.
 * @version 1.0
 */
@FeignClient(name = "service-provider")
public interface FeginRemoteInterface {

    @RequestMapping("/{name}")
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping("/file/upload")
    void upload();
}
