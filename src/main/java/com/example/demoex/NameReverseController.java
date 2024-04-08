package com.example.demoex;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1")
public class NameReverseController {
    @GetMapping("/name")
    public String returnName(@RequestParam String name){
        return name;
    }

    @PostMapping("/reverse")
    public String reverseName(@RequestBody String name) {

        return new StringBuilder(name).reverse().toString();
    }
}
