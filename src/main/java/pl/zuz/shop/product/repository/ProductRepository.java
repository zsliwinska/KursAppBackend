package pl.zuz.shop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zuz.shop.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
