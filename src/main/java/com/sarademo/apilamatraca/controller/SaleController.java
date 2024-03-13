package com.sarademo.apilamatraca.controller;

import com.sarademo.apilamatraca.dtos.ControllerResponse;
import com.sarademo.apilamatraca.dtos.SaleDto;
import com.sarademo.apilamatraca.services.SaleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    SaleService saleService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<ControllerResponse> saveNewSale(
           @Valid @RequestBody SaleDto dto){
        Long newSaleId = saleService.saveNewSale(dto);
        Map<String, Object> data = new HashMap<>();
        data.put("newSaleId", newSaleId);

        ControllerResponse controllerResponse = new ControllerResponse(HttpStatus.CREATED.value(), data, LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.CREATED).body(controllerResponse);
    }

}
