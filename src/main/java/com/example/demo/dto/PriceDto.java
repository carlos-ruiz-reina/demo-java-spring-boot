package com.example.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PriceDto {

    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private BrandDto brand;

    private PriceListDto priceList;

    private ProductDto product;

    private Integer priority;

    private BigDecimal price;

    private CurrencyDto currency;

}
