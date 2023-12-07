package com.example.FundingService.mapper;
import com.example.FundingService.db.entity.Funding;
import com.example.FundingService.rest.dto.FundingDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public interface FundingMapper {
    FundingMapper INSTANCE = Mappers.getMapper(FundingMapper.class);

    @Mapping(target = "id", source = "merchantId")
    FundingDto entityToDto(Funding funding);

    Funding dtoToEntity(FundingDto dto);
}
