package pl.zuz.shop.category.model;

import org.springframework.data.domain.Page;
import pl.zuz.shop.product.model.Product;

public record CategoryProductsDto(Category category, Page<Product> products) {
}
