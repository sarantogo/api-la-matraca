package com.sarademo.apilamatraca.controller;

import com.sarademo.apilamatraca.dtos.ControllerResponse;
import com.sarademo.apilamatraca.dtos.VetVisitDto;
import com.sarademo.apilamatraca.services.VetVisitService;
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
@RequestMapping("/visits")
public class VetVisitController {

    @Autowired
    VetVisitService visitService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<ControllerResponse> saveNewVisit(@Valid @RequestBody VetVisitDto dto){
        Long newVisitId = visitService.saveNewVisit(dto);
        Map<String, Object> data = new HashMap<>();
        data.put("newVisitId", newVisitId);

        ControllerResponse controllerResponse = new ControllerResponse(HttpStatus.OK.value(), data, LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.OK).body(controllerResponse);
    }

}
