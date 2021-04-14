package br.edu.usj.ads.pw.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloWorld {
    
    @GetMapping(value="helloWorld")
    public String getHelloWorld() {
        return "Hello Osmar";
    }
    
}
