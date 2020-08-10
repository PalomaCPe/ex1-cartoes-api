package com.ex1cartoesapi.controller;

import com.ex1cartoesapi.model.Buy;
import com.ex1cartoesapi.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/compras")
public class BuyController {
    @Autowired
    BuyService buyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Buy saveBuy(@RequestBody @Valid Buy buy) {
        return buyService.save(buy);
    }
}
