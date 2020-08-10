package com.ex1cartoesapi.repository;

import com.ex1cartoesapi.model.Buy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyRepository extends JpaRepository<Buy, Integer> {

    Buy findByCpf(String cpf);
}