package com.sarademo.apilamatraca.controller;

import com.sarademo.apilamatraca.dtos.CreateCowDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.services.CowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cows")
public class CowController {

    @Autowired
    CowService cowService;

    @PostMapping("/create")
    public ResponseEntity<Cow> saveNewCow(@RequestBody CreateCowDto cowDto){
        return ResponseEntity.status(HttpStatus.OK).body(cowService.saveNewCow(cowDto));
    }

    @GetMapping("/test")
    public String testController(){
        return "HOlA FUNCIONA";
    }
}
