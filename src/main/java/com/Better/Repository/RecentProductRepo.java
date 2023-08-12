package com.Better.Repository;
import com.Better.Models.Profile;
import com.Better.Models.RecentProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecentProductRepo extends JpaRepository <RecentProduct, Long> {
    RecentProduct findByProfile(Profile profile);
}
