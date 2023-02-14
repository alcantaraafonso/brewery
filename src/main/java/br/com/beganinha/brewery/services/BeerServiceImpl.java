package br.com.beganinha.brewery.services;

import br.com.beganinha.brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j //it will inject a log3j instance
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void upadteBeer(UUID beerId, BeerDto beerDto) {
        return;
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting a beer");
        return;
    }


}
