package tech.igris.bot.guild.settings.economy.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import tech.igris.bot.guild.settings.economy.enums.ItemType;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class ShopItem {
    @Id
    private Long id;
    @Enumerated
    private ItemType type;
    private Double price;
    private String description;
}