package br.com.beganinha.brewery.web.mappers;

import br.com.beganinha.brewery.domain.Beer;
import br.com.beganinha.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto toBeerDto(Beer beer);

    Beer toBeer(BeerDto beerDto);
}
