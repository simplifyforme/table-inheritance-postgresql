package com.simplifyforme.tableinheritancepostgresql.controllers;

import com.simplifyforme.tableinheritancepostgresql.entities.Book;
import com.simplifyforme.tableinheritancepostgresql.entities.Product;
import com.simplifyforme.tableinheritancepostgresql.services.ProcessService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MainController {

    private final ProcessService processService;

    @PostMapping("/product")
    public ResponseEntity<String> createProduct(@Valid @RequestBody Product product){
        processService.createNewProduct(product);
        return ResponseEntity.accepted().body("Ok!!");
    }

    @GetMapping("/book/{number}")
    public ResponseEntity<String> createBook(@Valid @PathVariable Integer number){
        processService.createBooks(number);
        return ResponseEntity.accepted().body("Ok!!");
    }



}
