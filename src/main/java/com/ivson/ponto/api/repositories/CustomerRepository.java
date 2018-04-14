package com.ivson.ponto.api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ivson.ponto.api.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

}
