package org.example.jdbc.controller;

import lombok.RequiredArgsConstructor;
import org.example.jdbc.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl service;

    @GetMapping("/products/fetch-product")
    public List<String> fetchProduct(@RequestParam String name) {
        return service.getProductName(name);
    }
}
