package com.example.nezwon_bot;

import com.example.nezwon_bot.config.TelegramProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TelegramProperties.class)
public class NezwonBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(NezwonBotApplication.class, args);
    }

}
