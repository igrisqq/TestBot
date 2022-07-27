package tech.igris.bot.guild.settings.economy.service;

import tech.igris.bot.guild.settings.economy.model.Currency;
import tech.igris.bot.guild.settings.economy.repository.CurrencyRepository;

import java.util.List;
import java.util.Optional;

public class CurrencyService {
    private CurrencyRepository currencyRepository;

    public Currency save(Currency currency) {
        return currencyRepository.save(currency);
    }

    public Optional<Currency> findById(Long id) {
        return currencyRepository.findById(id);
    }

    public List<Currency> findAllById(Long... ids) {
        return (List<Currency>) currencyRepository.findAllById(List.of(ids));
    }
}