package vn.edu.pxu.repository;

import vn.edu.pxu.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void addProduct(Product product);
    // Thêm các phương thức khác nếu cần
}
