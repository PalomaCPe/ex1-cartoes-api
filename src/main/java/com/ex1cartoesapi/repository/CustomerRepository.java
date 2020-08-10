package com.ex1cartoesapi.repository;

import com.ex1cartoesapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByCpf(String cpf);
}
