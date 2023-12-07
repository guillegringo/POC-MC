package com.example.FundingService.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "funding")
public class Funding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long merchantId;
    private String currencyCode;
    private double amount;
    private String status;
}
