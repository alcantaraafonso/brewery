package br.com.beganinha.brewery.services;

import br.com.beganinha.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void upadteBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
