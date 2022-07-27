package tech.igris.bot.guild.settings.economy.repository;

import org.springframework.data.repository.CrudRepository;
import tech.igris.bot.guild.settings.economy.model.ShopItem;

public interface ShopItemRepository extends CrudRepository<ShopItem, Long> {
}
