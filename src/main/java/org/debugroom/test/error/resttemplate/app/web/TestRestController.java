package org.debugroom.test.error.resttemplate.app.web;

import lombok.extern.slf4j.Slf4j;
import org.debugroom.test.error.resttemplate.app.model.TestModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class TestRestController {

    @RequestMapping(value="/get/test", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String test(){
        return "OK";
    }

    @RequestMapping(value="/post/test", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String testPost(@RequestBody TestModel testModel){
        log.info(testModel.toString());
        return "OK";
    }

}
