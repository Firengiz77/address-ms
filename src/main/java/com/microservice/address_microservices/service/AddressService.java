package com.microservice.address_microservices.service;

import com.microservice.address_microservices.model.Address;
import com.microservice.address_microservices.repository.AddressRepository;
import com.microservice.address_microservices.response.AddressResponse;
import org.springframework.stereotype.Service;
import com.microservice.address_microservices.mapper.AddressMapper;

@Service
public class AddressService {

    private  final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public AddressResponse getAddress(int employeeId) {
        Address address = addressRepository.findAddressByEmployeeId(employeeId);
        return AddressMapper.INSTANCE.addressToaddressResponse(address);
    }
}
