package com.Better.Payloads;
import com.Better.Payloads.Products.DisplayProductDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecentProductDto {
    private Long Id;
    private List<DisplayProductDto> products;
}
