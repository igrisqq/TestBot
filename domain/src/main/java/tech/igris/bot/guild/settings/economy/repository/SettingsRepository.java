package tech.igris.bot.guild.settings.economy.repository;

import org.springframework.data.repository.CrudRepository;
import tech.igris.bot.guild.settings.economy.model.Settings;

public interface SettingsRepository extends CrudRepository<Settings, Long> {
}
