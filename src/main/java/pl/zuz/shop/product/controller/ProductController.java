package pl.zuz.shop.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zuz.shop.product.model.Product;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts(){
        return List.of(
                new Product("Nowy product 1", "nowa kategoria 1", "nowy opis 1", new BigDecimal("8.99"), "PLN"),
                new Product("Nowy product 2", "nowa kategoria 2", "nowy opis 2", new BigDecimal("8.99"), "PLN"),
                new Product("Nowy product 3", "nowa kategoria 3", "nowy opis 3", new BigDecimal("8.99"), "PLN"),
                new Product("Nowy product 4", "nowa kategoria 4", "nowy opis 4", new BigDecimal("8.99"), "PLN")
        );
    }
}
