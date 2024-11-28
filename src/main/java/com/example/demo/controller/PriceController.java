package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.impl.PriceServiceImpl;

@RestController
@RequestMapping("/price")
public class PriceController {

    @Autowired
    private PriceServiceImpl priceService;

    @GetMapping
    public ResponseEntity<?> getPrice(@RequestParam("date") String date, @RequestParam("productId") Long productId,
	    @RequestParam("brandId") Long brandId) {

	LocalDateTime parseDate = LocalDateTime.parse(date, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	return priceService.getPriceByDateProductAndBrand(parseDate, productId, brandId);
    }

}
