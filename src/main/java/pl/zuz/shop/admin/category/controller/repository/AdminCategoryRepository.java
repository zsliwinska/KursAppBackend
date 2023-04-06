package pl.zuz.shop.admin.category.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zuz.shop.admin.category.model.AdminCategory;

public interface AdminCategoryRepository extends JpaRepository<AdminCategory, Long> {
}
