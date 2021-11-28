package com.example.qoutes_app;

import java.util.concurrent.ThreadLocalRandom;

public class Quotes {
    String[] quotesList= new String[] {"We were on a break!", "See? He's her lobster.",
            "Joey doesn't share food!", "Hi, I'm Chandler..",
            "I wish I could, but I don't want to.", "Seven!",
            "Pivot!", "How you doin'?",
            "Oh. My. God.", "I got off the plane."};

    String notifyQ = getRandomQuote(quotesList);

    public String getRandomQuote(String arr[]){
        int i = (int)(Math.random()*arr.length+1);
        return arr[i];
    }
}
