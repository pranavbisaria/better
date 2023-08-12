package com.Better.Payloads;

import com.Better.Models.Address;
import com.Better.Payloads.Products.ProductNameDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class MerchantOrderDto {
    private Long Id;
    private Address address;
    private ProductNameDto product;
    private Long Quantity;
    private String paymentId;
    private Integer amountReceived;
    private Date dateOfOrder;
    private UserShow Customer;
}
