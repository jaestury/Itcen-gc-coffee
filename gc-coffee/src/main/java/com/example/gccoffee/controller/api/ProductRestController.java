package com.example.gccoffee.controller.api;

import com.example.gccoffee.model.Category;
import com.example.gccoffee.model.Product;
import com.example.gccoffee.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/v1/products")
    public List<Product> productList(@RequestParam Optional<Category> category){
        return category
                .map(productService::getProductByCategory)
                .orElse(productService.getAllProducts());
    }

    @DeleteMapping("/api/v1/products")
    public UUID delete(@PathVariable UUID uuid){
        productService.deleteProduct(uuid);
        return uuid;
    }
}