package tech.igris.bot.guild.settings.economy.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Settings {
    @Id
    private Long id;
    private Boolean currencyIsEnabled;
    private Boolean shopIsEnabled;
    private Boolean paydayIsEnabled;
    private Boolean logIsEnabled;
}