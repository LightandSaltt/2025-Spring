package com.grepp.spring.infra.init;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class DataInitializeServiceTest {

    @Autowired
    DataInitializeService dataInitializeService;

    @Test
    public void initTest(){
        dataInitializeService.initialize();
    }

}