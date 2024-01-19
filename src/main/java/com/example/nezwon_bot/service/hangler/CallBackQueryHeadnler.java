package com.example.nezwon_bot.service.hangler;

import com.example.nezwon_bot.bot.Bot;
import com.example.nezwon_bot.service.contract.AbstractHandler;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)

public class CallBackQueryHeadnler  extends AbstractHandler {
    @Override
    public BotApiMethod<?> answer(BotApiObject object, Bot bot) {
        var qwery =(CallbackQuery) object ;
         throw  new UnsupportedOperationException();
    }
}
