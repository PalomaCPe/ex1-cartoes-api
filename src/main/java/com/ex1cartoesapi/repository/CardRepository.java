package com.ex1cartoesapi.repository;

import com.ex1cartoesapi.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer > {
    Card findByNumber(String number);
}
