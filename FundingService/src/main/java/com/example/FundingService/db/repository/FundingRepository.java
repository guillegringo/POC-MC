package com.example.FundingService.db.repository;

import com.example.FundingService.db.entity.Funding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundingRepository extends JpaRepository<Funding, Long> {
}

