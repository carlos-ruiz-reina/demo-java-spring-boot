package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Price;

public interface IPriceJpaRepository extends JpaRepository<Price, Long> {

    @EntityGraph(attributePaths = { "product", "brand", "priceList" })
    @Query("SELECT p FROM Price p WHERE p.startDate <= :date AND p.endDate >= :date "
	    + "AND p.product.id = :productId AND p.brand.id = :brandId "
	    + "AND p.priority = (SELECT MAX(p2.priority) FROM Price p2 WHERE p2.startDate <= :date AND p2.endDate >= :date "
	    + "AND p2.product.id = :productId AND p2.brand.id = :brandId)")
    Optional<Price> findFirstByDateProductAndBrand(@Param("date") LocalDateTime date,
	    @Param("productId") Long productId, @Param("brandId") Long brandId);

}
