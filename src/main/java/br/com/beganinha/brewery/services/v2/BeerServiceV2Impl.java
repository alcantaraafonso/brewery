package br.com.beganinha.brewery.services.v2;

import br.com.beganinha.brewery.web.model.BeerDto;
import br.com.beganinha.brewery.web.model.v2.BeerDtoV2;
import br.com.beganinha.brewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return beerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void upadteBeer(UUID beerId, BeerDtoV2 beerDto) {
        log.info("Updating a beer");
    }

    @Override
    public void deleteById(UUID beerId) {
        log.info("deleting a beer");
    }
}
