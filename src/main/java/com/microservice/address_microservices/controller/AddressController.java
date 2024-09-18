package com.microservice.address_microservices.controller;

import com.microservice.address_microservices.response.AddressResponse;
import com.microservice.address_microservices.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @GetMapping("/{employeeId}")
    public AddressResponse getAddress(@PathVariable int employeeId){
        return addressService.getAddress(employeeId);
    }

}
