package com.aspeek.crm.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xulingming on 2017/10/2.
 */
@SpringBootApplication
public class SampleTestApplication {

    // NOTE: this application will intentionally not start without MySQL, the test will
    // still run.

    public static void main(String[] args) {
        SpringApplication.run(SampleTestApplication.class, args);
    }

}