package com.ex1cartoesapi.service;

import com.ex1cartoesapi.model.Card;
import com.ex1cartoesapi.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    public Card save(Card card) {
        return cardRepository.save(card);
    }
}
