package org.debugroom.test.error.resttemplate.config;

import org.debugroom.test.error.resttemplate.app.model.TestModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class WebApp {

    private static final String SERVER_URL = "http://localhost:8080/";

    private static final String APP_NAME = "api/v1";

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
//        executeGetRequest(new RestTemplate());
        executePostRequest(new RestTemplate());
    }

    private static String executeGetRequest(RestTemplate restTemplate){
        return restTemplate.getForObject(SERVER_URL + APP_NAME
                + "/get/test", String.class);
    }

    private static String executePostRequest(RestTemplate restTemplate){
        TestModel testModel = TestModel.builder()
                .test("テスト")
                .testNestModels(Arrays.asList(
                        TestModel.TestNestModel.builder().nest("nest").build()))
                .build();
        return restTemplate.postForObject(SERVER_URL+ APP_NAME
        + "/post/test", testModel, String.class);
    }

}
