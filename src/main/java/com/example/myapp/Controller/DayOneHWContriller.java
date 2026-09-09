package com.example.myapp.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DayOneHWContriller {
	@GetMapping("/concert")
    public String concert() {
        return "WelcomeConcert";
    }
}
