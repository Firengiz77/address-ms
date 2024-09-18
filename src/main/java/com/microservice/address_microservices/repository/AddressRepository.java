package com.microservice.address_microservices.repository;

import com.microservice.address_microservices.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    @Query(value = "select a.id,a.line1,a.line2,a.state,a.zip from employee.address a join employee.employee e on e.id = a.employee_id where a.employee_id = :employeeId", nativeQuery = true)
    Address findAddressByEmployeeId(@Param("employeeId") Integer employeeId);
}
