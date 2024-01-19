package com.example.nezwon_bot.service;

import com.example.nezwon_bot.bot.Bot;
import com.example.nezwon_bot.service.hangler.CallBackQueryHeadnler;
import com.example.nezwon_bot.service.hangler.ComandHeandler;
import com.example.nezwon_bot.service.hangler.MassageHangler;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class UpdateDispacher {
    MassageHangler massageHangler ;
    ComandHeandler comandHeandler ;
    CallBackQueryHeadnler queryHeadnler;

    public BotApiMethod<?> distibut(Update update , Bot bot) {
        if (update.hasCallbackQuery()) {

            return queryHeadnler.answer(update.getCallbackQuery(),bot);
        }
        if (update.hasMessage()){
            var mesagge = update.getMessage();
            if (mesagge.hasText()){
                if (mesagge.getText().charAt(0)=='/'){
                    return  comandHeandler.answer(mesagge,bot);
                }
                return massageHangler.answer(mesagge,bot);


            }
        }
        log.warn("Не поддерживаемвый тип обновлений :" +update);

       return null ;

    }
}
