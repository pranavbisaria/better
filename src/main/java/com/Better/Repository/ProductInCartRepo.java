package com.Better.Repository;

import com.Better.Models.Product;
import com.Better.Models.ProductInCart;
import com.Better.Models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductInCartRepo extends JpaRepository<ProductInCart, Long> {
    Optional<ProductInCart> findByProductAndUser(Product product, User user);
    Page<ProductInCart> findByUser(User user, Pageable pageable);
    List<ProductInCart> findByUser(User user);
    void deleteByIdAndUser(Long Id, User user);
    Boolean existsByProductAndUser(Product product, User user);
}
