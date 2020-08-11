package com.ex1cartoesapi.repository;

import com.ex1cartoesapi.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer > {
    Optional<Card>  findByNumber(String number);

    Optional<Card> getByNumber(String number);
}
