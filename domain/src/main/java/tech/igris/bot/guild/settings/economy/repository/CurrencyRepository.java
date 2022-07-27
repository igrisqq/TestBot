package tech.igris.bot.guild.settings.economy.repository;

import org.springframework.data.repository.CrudRepository;
import tech.igris.bot.guild.settings.economy.model.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {
}
