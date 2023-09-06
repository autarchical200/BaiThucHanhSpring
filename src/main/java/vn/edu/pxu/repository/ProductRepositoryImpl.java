package vn.edu.pxu.repository;

import org.springframework.stereotype.Repository;
import vn.edu.pxu.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private static List<Product> productList = new ArrayList<>();
    private static int nextId =3 ;
    static {
        // Khởi tạo danh sách sản phẩm tĩnh ở đây
        productList.add(new Product(1, "Sản phẩm 1", 10.0));
        productList.add(new Product(2, "Sản phẩm 2", 20.0));
    }
    @Override
    public List<Product> getAllProducts() {
        return productList;
    }

    @Override
    public Product getProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        // Đặt id tự động tăng
        product.setId(nextId++);
        productList.add(product);
    }

    // Triển khai các phương thức khác nếu cần
}
