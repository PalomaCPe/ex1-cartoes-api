package com.ex1cartoesapi.service;

import com.ex1cartoesapi.model.Buy;
import com.ex1cartoesapi.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyService {
    @Autowired
    private BuyRepository buyRepository;

    public Buy save(Buy buy) {
        return buyRepository.save(buy);
    }
}
