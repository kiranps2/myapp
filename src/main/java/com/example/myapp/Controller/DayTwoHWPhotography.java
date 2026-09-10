package com.example.myapp.Controller;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DayTwoHWPhotography {
	@GetMapping("/start2")
    public String start2() {
        return "redirect:/photography";
    }
	
	@GetMapping("/photography")
    public String photography() {
        return "photography";
    }
}
