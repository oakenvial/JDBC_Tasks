package org.example.jdbc.controller;

import org.example.jdbc.repository.DBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class ProductsController {
    @Autowired
    private DBRepository dbRepository;

    @GetMapping("/products/fetch-product")
    public List<String> getProducts(@RequestParam String name) {
        return dbRepository.getProductName(name);
    }
}
