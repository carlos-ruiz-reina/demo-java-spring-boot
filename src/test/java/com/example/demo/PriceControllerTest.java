package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testCase1() throws Exception {
	mockMvc.perform(
		get("/price").param("date", "2020-06-14T10:00:00").param("productId", "35455").param("brandId", "1"))
		.andExpect(status().isOk()).andExpect(jsonPath("$.price").value(35.50));
    }

    @Test
    void testCase2() throws Exception {
	mockMvc.perform(
		get("/price").param("date", "2020-06-14T16:00:00").param("productId", "35455").param("brandId", "1"))
		.andExpect(status().isOk()).andExpect(jsonPath("$.price").value(25.45));
    }

    @Test
    void testCase3() throws Exception {
	mockMvc.perform(
		get("/price").param("date", "2020-06-14T21:00:00").param("productId", "35455").param("brandId", "1"))
		.andExpect(status().isOk()).andExpect(jsonPath("$.price").value(35.50));
    }

    @Test
    void testCase4() throws Exception {
	mockMvc.perform(
		get("/price").param("date", "2020-06-15T10:00:00").param("productId", "35455").param("brandId", "1"))
		.andExpect(status().isOk()).andExpect(jsonPath("$.price").value(30.50));
    }

    @Test
    void testCase5() throws Exception {
	mockMvc.perform(
		get("/price").param("date", "2020-06-16T21:00:00").param("productId", "35455").param("brandId", "1"))
		.andExpect(status().isOk()).andExpect(jsonPath("$.price").value(38.95));
    }
}