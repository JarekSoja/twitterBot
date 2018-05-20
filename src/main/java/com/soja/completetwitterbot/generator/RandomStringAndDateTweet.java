package com.soja.completetwitterbot.generator;

import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.UUID;

@NoArgsConstructor
public class RandomStringAndDateTweet implements Tweet {

    private String generateRanomString() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String getTweetContent() {
        return generateRanomString() + "    " + LocalTime.now();
    }

}