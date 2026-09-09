package com.example.myapp.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DayOneCWController {
	@GetMapping("/student")
    public String student() {
        return "HelloStudent";
    }
}
