package com.Better.Repository;

import com.Better.Models.Cart;
import com.Better.Models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart, Long> {
    Cart findByProfile(Profile profile);
}
