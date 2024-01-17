package com.example.nezwon_bot.bot;

import com.example.nezwon_bot.config.TelegramProperties;
import com.example.nezwon_bot.service.UpdateDispacher;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public final class   Bot   extends  TelegramWebhookBot {

    TelegramProperties properties ;
    UpdateDispacher updateDispacher ;

    public Bot(@Qualifier("bot-com.example.nezwon_bot.config.TelegramProperties") TelegramProperties properties, UpdateDispacher updateDispacher) {
        super(properties.getToken());
        this.properties = properties;
        this.updateDispacher = updateDispacher;
    }



    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return updateDispacher.distibut(update);
    }

    @Override
    public String getBotPath() {
        return properties.getUrl();
    }

    @Override
    public String getBotUsername() {
        return properties.getName();
    }
}
