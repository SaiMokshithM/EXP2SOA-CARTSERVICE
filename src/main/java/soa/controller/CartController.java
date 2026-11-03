package soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.service.CartService;

@RestController
public class CartController {
     
    CartService CS;
    public CartController(CartService CS) {
        this.CS = CS;
    }

    @GetMapping("/")
    public String home() {
        return "Cart Service is UP and running!";
    }

    @GetMapping("/cart")
    public Object cart() {
        return CS.getAllCartItems();
    }
}
