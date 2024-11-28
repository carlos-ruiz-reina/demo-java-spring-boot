package com.example.demo.service.interfaces;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;

public interface IPriceService {

    public ResponseEntity<?> getPriceByDateProductAndBrand(LocalDateTime date, Long productId, Long brandId);

}
