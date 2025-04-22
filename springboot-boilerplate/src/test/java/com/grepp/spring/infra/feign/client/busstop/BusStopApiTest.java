package com.grepp.spring.infra.feign.client.busstop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BusStopApiTest {

    @Autowired
    BusStopApi busStopLocationApi;

    @Value("bus-stop.apikey")
    String apiKey;

    @Test
    public void feignTest(){
        System.out.println(busStopLocationApi.getBusStop("64524f7863716b72363553766f6b6c", 1,5));
    }

}