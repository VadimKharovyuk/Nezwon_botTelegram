package com.example.nezwon_bot.service.manager;

import com.example.nezwon_bot.bot.Bot;
import com.example.nezwon_bot.service.contract.AbstractManager;
import com.example.nezwon_bot.service.contract.ComandLithener;
import com.example.nezwon_bot.service.contract.QweryLithener;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class MainManager  extends AbstractManager  implements ComandLithener, QweryLithener {
    @Override
    public BotApiMethod<?> mainMenu(Message message, Bot bot) {
        return null;
    }

    @Override
    public BotApiMethod<?> mainMenu(CallbackQuery query, Bot bot) {
        return null;
    }

    @Override
    public BotApiMethod<?> answerCommand(Message message, Bot bot) {
        return greetings(message.getChatId());
    }

    @Override
    public BotApiMethod<?> answerQwery(CallbackQuery query, Bot bot) {
        return null;
    }
    private BotApiMethod <?> greetings (Long chatId){
        return SendMessage.builder()
                .chatId(chatId)
                .text("Приветствую дорогой друг")
                .build();
    }
}
