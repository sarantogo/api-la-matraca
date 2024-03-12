package com.sarademo.apilamatraca.controller;

import com.sarademo.apilamatraca.dtos.CowResponseDto;
import com.sarademo.apilamatraca.dtos.CreateCowDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.services.CowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cows")
public class CowController {

    @Autowired
    CowService cowService;
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<Long> saveNewCow(@RequestBody CreateCowDto cowDto){
        return ResponseEntity.status(HttpStatus.OK).body(cowService.saveNewCow(cowDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CowResponseDto>> getAllCows(){
        return ResponseEntity.status(HttpStatus.OK).body(cowService.getAllCows());
    }

    @PostMapping("/newSale")


    @GetMapping("/test")
    public String testController(){
        return "HOlA FUNCIONA";
    }
}
