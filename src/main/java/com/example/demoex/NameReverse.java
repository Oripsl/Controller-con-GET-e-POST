package com.example.demoex;

import org.springframework.web.bind.annotation.*;


@RestController
public class NameReverse {
    @GetMapping("/reverse/{name}")
    public String returnName(@PathVariable String name){
        return name;
    }

    @PostMapping("/reverse")
    public String reverseName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
