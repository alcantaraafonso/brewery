package br.com.beganinha.brewery.services.v2;

import br.com.beganinha.brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void upadteBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
