package dev.phastixtv.blackbull.bot;

import lombok.Getter;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

@Getter
public class Bot {

    public static Bot getInstance;

    private final JDA jda;

    private final String token;

    public Bot(final String token) {
        getInstance = this;
        this.token = token;
        jda = JDABuilder.createDefault(token)
                .build();
    }
}
