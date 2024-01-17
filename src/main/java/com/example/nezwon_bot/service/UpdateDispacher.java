package com.example.nezwon_bot.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class UpdateDispacher {
    public BotApiMethod<?> distibut(Update update) {
        throw  new UnsupportedOperationException();

    }
}
