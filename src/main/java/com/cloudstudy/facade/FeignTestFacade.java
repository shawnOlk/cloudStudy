package com.cloudstudy.facade;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sunlei on 31/01/2018.
 */
@FeignClient(value = "${config.eureka.provider}")
public interface FeignTestFacade {
    @RequestMapping(value = "/name" ,method = RequestMethod.GET)
    String getName();
}
