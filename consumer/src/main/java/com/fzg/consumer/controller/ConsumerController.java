package com.fzg.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/instances")
    public List<ServiceInstance> instances(){
        List<ServiceInstance> provider = this.discoveryClient.getInstances("provider");
        return provider;
    }
}
