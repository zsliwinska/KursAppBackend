package pl.zuz.shop.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zuz.shop.admin.model.AdminProduct;

public interface AdminProductRepository extends JpaRepository<AdminProduct, Long> {
}
