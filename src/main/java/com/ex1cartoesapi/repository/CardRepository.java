package com.ex1cartoesapi.repository;

import com.ex1cartoesapi.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao,Integer > {
    Cartao findByNumber(String numero);
}
