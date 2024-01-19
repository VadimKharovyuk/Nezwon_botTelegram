package com.example.nezwon_bot.service.contract;

import com.example.nezwon_bot.bot.Bot;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;

public  abstract class AbstractHandler {
    public abstract BotApiMethod<?> answer(BotApiObject object, Bot bot);
}
