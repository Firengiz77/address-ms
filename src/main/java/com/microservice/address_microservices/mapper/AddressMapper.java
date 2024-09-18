package com.microservice.address_microservices.mapper;

import com.microservice.address_microservices.model.Address;
import com.microservice.address_microservices.response.AddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressResponse addressToaddressResponse(Address address);

}
