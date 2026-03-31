package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
    public String momoShop() {
        return "index";   // loads index.html
    }

    @PostMapping("/order")
    public String placeOrder(
            @RequestParam String name,
            @RequestParam String momoType,
            @RequestParam int quantity,
            Model model) {

        int total = helloService.calculateTotal(momoType, quantity);

        model.addAttribute("name", name);
        model.addAttribute("momoType", momoType);
        model.addAttribute("quantity", quantity);
        model.addAttribute("total", total);

        return "confirm";   // loads confirm.html
    }
}
