package br.com.wkstudy.resources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloResource {

    @GetMapping
    public ResponseEntity<String> hello() {
        log.info("receive request for hello endpoint.");

        return ResponseEntity.ok("hello world!");
    }
}
