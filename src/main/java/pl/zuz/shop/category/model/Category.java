package pl.zuz.shop.category.model;

import jakarta.persistence.*;
import lombok.Getter;
import pl.zuz.shop.product.model.Product;

import java.util.List;

@Entity
@Getter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String description;
    private String slug;


}
