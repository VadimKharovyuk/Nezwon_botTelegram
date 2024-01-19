package com.example.nezwon_bot.service.contract;

import com.example.nezwon_bot.bot.Bot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

public interface QweryLithener {
    BotApiMethod <?> answerQwery(CallbackQuery query, Bot bot);

}
