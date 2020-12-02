package com.platzimarket.web.controller;

import com.platzimarket.domain.Product;
import com.platzimarket.domain.Pursache;
import com.platzimarket.domain.service.PursacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pursache")
public class PursacheController {
    @Autowired
    private PursacheService pursacheService;

    @GetMapping("/all")
    public ResponseEntity<List<Pursache>> getAll() {
        return new ResponseEntity<>(pursacheService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<Pursache>> getByClient(@PathVariable("clientId") String clientId) {
        return pursacheService.getByClient(clientId)
                .map(pursaches -> new ResponseEntity<>(pursaches, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Pursache> save(@RequestBody Pursache pursache) {
        return new ResponseEntity<>(pursacheService.save(pursache), HttpStatus.CREATED);
    }
}
