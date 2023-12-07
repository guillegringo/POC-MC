package com.example.FundingService.service;

import com.example.FundingService.db.entity.Funding;
import com.example.FundingService.db.repository.FundingRepository;
import com.example.FundingService.mapper.FundingMapper;
import com.example.FundingService.rest.dto.FundingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FundingService {

    @Autowired
    private FundingRepository fundingRepository;
    @Autowired
    private FundingMapper fundingMapper;

    public List<FundingDto> getAllFundings() {
        List<Funding> aver = fundingRepository.findAll();
        System.out.println(aver);
        return fundingRepository.findAll().stream()
                .map(fundingMapper::entityToDto)
                .collect(Collectors.toList());
    }

    public ResponseEntity<FundingDto> getFundingById(Long id) {
        return fundingRepository.findById(id)
                .map(fundingMapper::entityToDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


}

