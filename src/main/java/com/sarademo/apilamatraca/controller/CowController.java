package com.sarademo.apilamatraca.controller;

import com.sarademo.apilamatraca.dtos.ControllerResponse;
import com.sarademo.apilamatraca.dtos.CowResponseDto;
import com.sarademo.apilamatraca.dtos.CreateCowDto;
import com.sarademo.apilamatraca.entities.Cow;
import com.sarademo.apilamatraca.services.CowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cows")
public class CowController {

    @Autowired
    CowService cowService;
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<ControllerResponse> saveNewCow(@RequestBody CreateCowDto cowDto){
        Long newCowId = cowService.saveNewCow(cowDto);
        Map<String, Object> data = new HashMap<>();
        data.put("data", newCowId);

        ControllerResponse controllerResponse = new ControllerResponse(HttpStatus.OK.value(), data, LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.OK).body(controllerResponse);
    }

    @GetMapping("/getAll")
    public ResponseEntity<ControllerResponse> getAllCows(){
        List<CowResponseDto> cows = cowService.getAllCows();
        Map<String, Object> data = new HashMap<>();
        data.put("data", cows);

        ControllerResponse controllerResponse = new ControllerResponse(HttpStatus.OK.value(), data, LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.OK).body(controllerResponse);
    }

    @GetMapping("/test")
    public String testController(){
        return "HOlA FUNCIONA";
    }
}
