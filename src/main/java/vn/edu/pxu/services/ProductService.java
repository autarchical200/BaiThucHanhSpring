package vn.edu.pxu.services;

import vn.edu.pxu.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void addProduct(Product product);
    // Thêm các phương thức khác nếu cần
}
