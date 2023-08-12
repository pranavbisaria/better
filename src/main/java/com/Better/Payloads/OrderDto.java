package com.Better.Payloads;

import com.Better.Models.DeliveryStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private String orderId;
    private String image;
    @JsonFormat(pattern = "dd-MMM-yyyy")
    private Date dateOfPurchase;
    @JsonFormat(pattern = "dd-MMM-yyyy")
    private Date created_at;
    private Set<DeliveryStatus> deliveryStatus = new HashSet<>(0);
    private Integer amount;
    private String paymentId;
    private String status;
}
