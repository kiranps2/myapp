package com.example.myapp.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DayTwoCWPortfolio {
	@GetMapping("/start")
    public String start() {
        return "redirect:/portfolio";
    }
	
	@GetMapping("/portfolio")
    public String portfolio() {
        return "portfolio";
    }
}
