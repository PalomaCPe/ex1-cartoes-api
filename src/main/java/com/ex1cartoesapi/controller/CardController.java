package com.ex1cartoesapi.controller;

import com.ex1cartoesapi.model.Card;
import com.ex1cartoesapi.service.CardService;
import com.ex1cartoesapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cartao")
public class CardController {
    @Autowired
    CardService cardService;

    @Autowired
    CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Card saveCard(@RequestBody @Valid Card card) {
//        card.setCustomer(
//                customerService.findById(card.getCustomerId())
//        );

        return cardService.save(card);
    }
}
