package com.example.FundingService.rest.controller;

import com.example.FundingService.rest.dto.FundingDto;
import com.example.FundingService.service.FundingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fundings")
@Tag(name = "Fundings", description = "Endpoints para operaciones CRUD en fundings")
public class FundingController {

    @Autowired
    private FundingService fundingService;

    @GetMapping
    @Operation(summary = "get All Fundings")
    public List<FundingDto> getAllFundings() {
        return fundingService.getAllFundings();
    }

    @GetMapping("/{id}")
    @Operation(summary = "get funding by ID")
    public ResponseEntity<FundingDto> getFundingById(@PathVariable Long id) {
        return fundingService.getFundingById(id);
    }
}
