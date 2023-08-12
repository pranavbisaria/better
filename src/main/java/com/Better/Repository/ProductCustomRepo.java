package com.Better.Repository;

import com.Better.Models.Product;
import java.util.List;

public interface ProductCustomRepo {
    List<Product> searchProduct(String keyword);
}
