package com.ex1cartoesapi.DTO.Mapper;

import com.ex1cartoesapi.DTO.Request.BuyRequest;
import com.ex1cartoesapi.DTO.Response.BuyResponse;
import com.ex1cartoesapi.model.Buy;
import com.ex1cartoesapi.model.Card;
import org.springframework.stereotype.Component;

@Component
public class BuyMapper {
    public Buy toBuy(BuyRequest buyRequest) {
        Buy buy = new Buy();
        buy.setDescription(buyRequest.getDescription());
        buy.setValue(buyRequest.getValue());

        Card cartao = new Card();
        cartao.setId(buyRequest.getCardId());

        buy.setCard(cartao);

        return buy;
    }

    public BuyResponse toBuyResponse(Buy buy) {
        BuyResponse buyResponse = new BuyResponse();
        buyResponse.setCardId(buy.getCard().getId());
        buyResponse.setDescription(buy.getDescription());
        buyResponse.setValue(buy.getValue());
        buyResponse.setId(buy.getId());

        return buyResponse;

    }
}
