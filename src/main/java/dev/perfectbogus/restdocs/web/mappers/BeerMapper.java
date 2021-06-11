package dev.perfectbogus.restdocs.web.mappers;

import dev.perfectbogus.restdocs.domain.Beer;
import dev.perfectbogus.restdocs.web.models.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
