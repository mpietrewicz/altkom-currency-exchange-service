package pl.altkom.currencyexchangeservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.Arrays;

@Configuration
public class CurrencyExchangeConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(CurrencyExchangeRepository currencyExchangeRepository) {
        return args -> {
            CurrencyExchange exchangePlnUsd = new CurrencyExchange(1L, "PLN", "USD", new BigDecimal(20));
            CurrencyExchange exchangeUsdPln = new CurrencyExchange(2L, "USD", "PLN", new BigDecimal(40));
            currencyExchangeRepository.saveAll(Arrays.asList(exchangePlnUsd, exchangeUsdPln));
        };
    }

}
