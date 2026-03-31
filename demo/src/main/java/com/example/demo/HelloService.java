package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public int calculateTotal(String momoType, int quantity) {

        int price;

        switch (momoType) {
            case "Chicken Momo" -> price = 120;
            case "Paneer Momo" -> price = 100;
            case "Cheese Corn Momo" -> price = 110;
            default -> price = 80;
        }

        return price * quantity;
    }
}
