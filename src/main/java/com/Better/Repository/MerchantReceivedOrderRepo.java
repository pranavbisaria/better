package com.Better.Repository;

import com.Better.Models.MerchantOrderReceived;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantReceivedOrderRepo  extends JpaRepository<MerchantOrderReceived, Long> {
}
