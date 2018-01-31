package com.cloudstudy.facade.impl;

import com.cloudstudy.facade.EurekaTestFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunlei on 30/01/2018.
 */
@Service
public class EurekaTestFacadeImpl implements EurekaTestFacade {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${config.eureka.provider}")
    private String provider;
    @Override
    public String getName() {
        return restTemplate.getForObject("http://"+provider+"/name", String.class);
    }

}
