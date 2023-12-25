package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BuyNowController {


    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam Long productID) {
        Optional<Product> optionalProduct = productRepository.findById(productID);

        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();

            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "buysuccess";
            } else {
                return "buyerror"; // Redirect to error page (out of stock)
            }
        } else {
            return "/buyerror"; // Redirect to error page (product not found)
        }
    }

}
