package pl.zuz.shop.admin.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pl.zuz.shop.admin.dto.AdminProductDto;
import pl.zuz.shop.admin.model.AdminProduct;
import pl.zuz.shop.admin.service.AdminProductService;

@RestController
@RequiredArgsConstructor
public class AdminProductController {

    private static final Long EMPTY_ID = null;
    private final AdminProductService productService;

    @GetMapping("/admin/products")
    public Page<AdminProduct> getProducts(Pageable pageable){
       return productService.getProducts(pageable);
    }

    @GetMapping("/admin/products/{id}")
    public AdminProduct getProduct(@PathVariable Long id){
        return productService.getProduct(id);
    }

    @PostMapping("/admin/products")
    public AdminProduct createProduct(@RequestBody @Valid AdminProductDto adminProductDto){
        return productService.createProduct(mapAdminProduct(adminProductDto, EMPTY_ID));
    }

    @PutMapping ("/admin/products/{id}")
    public AdminProduct updateProduct(@RequestBody @Valid AdminProductDto adminProductDto, @PathVariable Long id ){
        return productService.updateProduct(mapAdminProduct(adminProductDto, id)
        );
    }

    @DeleteMapping("/admin/products/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    private AdminProduct mapAdminProduct(@RequestBody AdminProductDto adminProductDto, @PathVariable Long id) {
        return AdminProduct.builder()
                .id(id)
                .name(adminProductDto.getName())
                .description(adminProductDto.getDescription())
                .category(adminProductDto.getCategory())
                .price(adminProductDto.getPrice())
                .currency(adminProductDto.getCurrency())
                .build();
    }
}
