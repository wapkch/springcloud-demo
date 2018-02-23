package com.aihuishou.consumer.controller;

import com.aihuishou.consumer.feign.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    /*@Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/hello",String.class).getBody();
    }
*/

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(){
        return computeClient.add(10,10);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return computeClient.hello();
    }
}
