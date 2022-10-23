package com.fzg.provider.test;

import org.springframework.web.client.RestTemplate;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        RestTemplate restTemplate = new RestTemplate();
        for (int i = 0; i < 1000; i++) {
            restTemplate.getForObject("http://localhost:8083/list",String.class);
            Thread.sleep(200);
        }
    }
}
