package com.example.demo.service.impl;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PriceDto;
import com.example.demo.repository.IPriceJpaRepository;
import com.example.demo.service.interfaces.IPriceService;

@Service
public class PriceServiceImpl implements IPriceService {

    @Autowired
    private IPriceJpaRepository priceRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseEntity<?> getPriceByDateProductAndBrand(LocalDateTime date, Long productId, Long brandId) {
	return priceRepository.findFirstByDateProductAndBrand(date, productId, brandId)
		.map(price -> new ResponseEntity<>(modelMapper.map(price, PriceDto.class), HttpStatus.OK))
		.orElse(ResponseEntity.notFound().build());
    }

}
