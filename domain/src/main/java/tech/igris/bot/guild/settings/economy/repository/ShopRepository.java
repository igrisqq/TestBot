package tech.igris.bot.guild.settings.economy.repository;

import org.springframework.data.repository.CrudRepository;
import tech.igris.bot.guild.settings.economy.model.Shop;

public interface ShopRepository extends CrudRepository<Shop, Long> {
}
