package com.ex1cartoesapi.controller;

import com.ex1cartoesapi.DTO.Mapper.BuyMapper;
import com.ex1cartoesapi.DTO.Request.BuyRequest;
import com.ex1cartoesapi.DTO.Response.BuyResponse;
import com.ex1cartoesapi.model.Buy;
import com.ex1cartoesapi.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/compras")
public class BuyController {
    @Autowired
    BuyService buyService;

    @Autowired
    BuyMapper buyMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BuyResponse saveBuy(@RequestBody BuyRequest buyRequest) {
        Buy buy = buyMapper.toBuy(buyRequest);
        buy = buyService.save(buy);

        return buyMapper.toBuyResponse(buy);
    }

    @GetMapping("/{cardId}")
    public List<BuyResponse> listByCardId(@PathVariable int cardId) {
        List<Buy> buys = buyService.listBuyByCardNumber(cardId);
        List<BuyResponse> buyResponseList = buys.stream()
                .map(buy -> buyMapper.toBuyResponse(buy))
                .collect(Collectors.toList());
        return buyResponseList;
    }
}
