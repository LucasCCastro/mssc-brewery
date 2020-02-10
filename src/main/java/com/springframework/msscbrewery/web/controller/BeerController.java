package com.springframework.msscbrewery.web.controller;

import com.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

//    @GetMapping("/{beerId}")
//    public ResponseEntity<BeerDto> getBeer(UUID) {
//
//    }
}
