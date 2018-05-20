package com.soja.completetwitterbot.generator;

import fastily.jwiki.core.NS;
import fastily.jwiki.core.Wiki;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RandomEnglishWikiLinkTweet implements Tweet {

    @Override
    public String getTweetContent() {

        Wiki wiki = new Wiki("en.wikipedia.org");
        String wikiPage = wiki.getRandomPages(1, NS.MAIN).get(0).replace(" ", "_");

        return "https://en.wikipedia.org/wiki/" + wikiPage;
    }
}
