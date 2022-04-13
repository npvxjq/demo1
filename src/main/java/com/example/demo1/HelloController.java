package com.example.demo1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        return  responseOk("under construction");
    }


    private <T> ResponseEntity<T> responseOk(T body) {
        return  ResponseEntity.ok().body(body);
    }

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok().body("test2");
    }
}