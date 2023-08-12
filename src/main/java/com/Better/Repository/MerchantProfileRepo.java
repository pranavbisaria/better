package com.Better.Repository;

import com.Better.Models.MerchantProfile;
import com.Better.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantProfileRepo extends JpaRepository <MerchantProfile, Long> {
    MerchantProfile findByUser(User user);
}
