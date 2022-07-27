package tech.igris.bot.guild.settings.economy.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Currency {
    @Id
    private Long id;
    @NotNull
    @Size(min = 3, max = 3)
    private String shortName;
    @NotNull
    @Size(max = 24)
    private String fullName;
}