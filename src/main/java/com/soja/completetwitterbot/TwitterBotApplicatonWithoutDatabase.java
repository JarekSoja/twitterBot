package com.soja.completetwitterbot;

import com.soja.completetwitterbot.generator.RandomEnglishWikiLinkTweet;
import com.soja.completetwitterbot.generator.RandomStringAndDateTweet;
import com.soja.completetwitterbot.generator.Tweet;
import com.soja.completetwitterbot.interval_controller.TaskInterval;
import com.soja.completetwitterbot.logger.BotLogger;

public class TwitterBotApplicatonWithoutDatabase {

    public static void main(String[] args) {

        BotLogger botLogger = new BotLogger();
        Tweet tweet = new RandomEnglishWikiLinkTweet();
        TaskInterval taskInterval = new TaskInterval(0,600000);
        taskInterval.startTask(botLogger.getTwitter(), tweet);
    }
}
