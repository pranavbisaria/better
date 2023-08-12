package com.Better.Repository;
import com.Better.Models.Profile;
import com.Better.Models.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WishListRepo extends JpaRepository<WishList, Long> {
    WishList findByProfile(Profile profile);
}
