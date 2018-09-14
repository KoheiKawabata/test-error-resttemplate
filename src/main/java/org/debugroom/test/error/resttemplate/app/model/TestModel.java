package org.debugroom.test.error.resttemplate.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TestModel {

    private String test;
    private List<TestNestModel> testNestModels;

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class TestNestModel {
        private String nest;
    }

}
