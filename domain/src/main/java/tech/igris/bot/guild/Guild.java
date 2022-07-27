package tech.igris.bot.guild;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Guild {
    @Id
    private Long id;
    private Long ownerId;
    private Long shopId;
}