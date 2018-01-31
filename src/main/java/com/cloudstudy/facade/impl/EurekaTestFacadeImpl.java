package com.cloudstudy.facade.impl;

import com.cloudstudy.facade.EurekaTestFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunlei on 30/01/2018.
 */
@Service
public class EurekaTestFacadeImpl implements EurekaTestFacade {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getName() {
        return restTemplate.getForObject("http://EUREKAPROVIDER/name", String.class);
    }

}
