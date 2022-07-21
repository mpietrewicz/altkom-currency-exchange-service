package pl.altkom.currencyexchangeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getExchange(@PathVariable(name = "from") String from, @PathVariable(name = "to") String to) {
        return new CurrencyExchange(1L, from, to, new BigDecimal(30));
    }

}
