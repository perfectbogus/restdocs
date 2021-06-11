package dev.perfectbogus.restdocs.bootstrap;

import dev.perfectbogus.restdocs.domain.Beer;
import dev.perfectbogus.restdocs.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Mango Boob")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(200)
                    .upc(12341234L)
                    .price(new BigDecimal("12.95"))
                    .build()
            );

            beerRepository.save(Beer.builder()
                    .beerName("Corona")
                    .beerStyle("ALE")
                    .quantityToBrew(200)
                    .minOnHand(200)
                    .upc(123412341234L)
                    .price(new BigDecimal("11.93"))
                    .build()
            );
        }
    }
}
