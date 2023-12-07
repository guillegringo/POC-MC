package com.example.FundingService.rest.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class FundingDto {

    @Schema(description = "Funding ID", example = "1")
    private Long id;

    @Schema(description = "Currency code", example = "USD")
    private String currencyCode;

    @Schema(description = "Funding amount", example = "1000.0")
    private double amount;

    @Schema(description = "Funding status", example = "ACTIVE")
    private String status;
}


