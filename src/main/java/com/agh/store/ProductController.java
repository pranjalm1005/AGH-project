package com.agh.store;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private final List<Product> products = Arrays.asList(
        new Product(
            1,
            "iPhone 15",
            59999,
            "Apple smartphone with an advanced camera.",
            "https://images.unsplash.com/photo-1695048133142-1a20484d2569?w=500"
        ),
        new Product(
            2,
            "Samsung Galaxy S24",
            54999,
            "Samsung smartphone with an impressive display.",
            "https://images.unsplash.com/photo-1610945265064-0e34e5519bbf?w=500"
        ),
        new Product(
            3,
            "Google Pixel 8",
            49999,
            "Google smartphone with an excellent camera.",
            "https://images.unsplash.com/photo-1598327105666-5b89351aff97?w=500"
        )
    );

    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return products.stream()
            .filter(product -> product.getId() == id)
            .findFirst()
            .orElse(null);
    }
}