package com.seven.jong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
    public String home() {
        System.out.println("main 진입");
        return "main";
    }


    @GetMapping("hello")
    public String hello() {
        System.out.println("hello 진입");
        return "hello";
    }
}
