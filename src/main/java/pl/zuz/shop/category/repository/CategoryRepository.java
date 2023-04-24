package pl.zuz.shop.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zuz.shop.category.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
