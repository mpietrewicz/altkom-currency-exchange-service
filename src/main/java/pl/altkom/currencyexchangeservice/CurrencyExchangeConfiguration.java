package pl.altkom.currencyexchangeservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class CurrencyExchangeConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(CurrencyExchangeRepository currencyExchangeRepository) {
        return args -> {
            CurrencyExchange currencyExchange = new CurrencyExchange(1L, "PLN", "USD", new BigDecimal(20));
            currencyExchangeRepository.save(currencyExchange);
        };
    }

}
