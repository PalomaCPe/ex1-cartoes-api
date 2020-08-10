package com.ex1cartoesapi.controller;

import com.ex1cartoesapi.model.Card;
import com.ex1cartoesapi.service.BuyService;
import com.ex1cartoesapi.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cartoes")
public class CardController {
    @Autowired
    CardService cardService;

    @Autowired
    BuyService buyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Card saveCard(@RequestBody @Valid Card card) {
        return cardService.save(card);
    }


}
