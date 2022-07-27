package tech.igris.bot.guild.settings.economy.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Shop {
    private Long id;
    private Long bannerId;
    private Long messageId;
    private String description;
    @NotNull
    @Size(min = 8)
    private String accessPassword;
}