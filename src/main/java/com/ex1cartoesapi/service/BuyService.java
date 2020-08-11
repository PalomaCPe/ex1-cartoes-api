package com.ex1cartoesapi.service;

import com.ex1cartoesapi.model.Buy;
import com.ex1cartoesapi.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyService {
    @Autowired
    private BuyRepository buyRepository;

    public Buy save(Buy buy) {
        return buyRepository.save(buy);
    }

    public List<Buy> listBuyByCardNumber(Integer id) {
        return buyRepository.findAllByCardId(id);
    }
}
