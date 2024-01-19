package com.example.nezwon_bot.service.hangler;

import com.example.nezwon_bot.bot.Bot;
import com.example.nezwon_bot.service.contract.AbstractHandler;
import com.example.nezwon_bot.service.manager.MainManager;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class ComandHeandler  extends AbstractHandler {
    MainManager   mainManager ;
    @Override
    public BotApiMethod<?> answer(BotApiObject object, Bot bot) {
        var message= (Message) object ;
        if ("/start".equals(message.getText())){
            return mainManager.answerCommand(message,bot);

        }
        throw  new UnsupportedOperationException();

    }

}
