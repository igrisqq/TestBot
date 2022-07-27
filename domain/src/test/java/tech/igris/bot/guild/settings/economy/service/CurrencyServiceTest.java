package tech.igris.bot.guild.settings.economy.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.igris.bot.guild.settings.economy.model.Currency;
import tech.igris.bot.guild.settings.economy.repository.CurrencyRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CurrencyServiceTest {
    @InjectMocks
    private CurrencyService currencyService;
    @Mock
    private CurrencyRepository currencyRepository;
    private List<Currency> storage;

    @BeforeEach
    void setUp() {
        storage = List.of(
                buildCurrency(1L, "asd", "asd"),
                buildCurrency(2L, "sdf", "sdf"));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {

    }

    @Test
    void findById() {
        Currency findedCurrency = buildCurrency(1L, "asd", "asd");
        Mockito.when(currencyRepository.findById(1L)).thenReturn(Optional.of(findedCurrency));
        assertEquals(findedCurrency, currencyService.findById(1L).get());
    }

    @Test
    void findAllById() {
    }

    static Currency buildCurrency(Long id, String fullName, String shortName) {
        return Currency.builder()
                .id(id)
                .fullName(fullName)
                .shortName(shortName)
                .build();
    }
}