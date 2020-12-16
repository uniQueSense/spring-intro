package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
@Component("messageService0")
@Scope("prototype")

public class RandomTextMessageService implements MessageService {

    List<String> tablica = List.of("Wiadomosc: 1", "Wiadomosc: 2", "Wiadomosc: 3", "Wiadomosc: 4", "Wiadomosc: 5", "Wiadomosc: 6", "Wiadomosc: 7", "Wiadomosc: 8", "Wiadomosc: 9", "Wiadomosc: 10");


    @Override
    public String getMessage() {
        int losowa_liczba = new Random().nextInt(9);
        return tablica.get(losowa_liczba);
    }
}
