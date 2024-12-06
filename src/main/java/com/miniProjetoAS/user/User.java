package com.miniProjetoAS.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String name;
    private String Email;
    private int SubscriptionId;
    private int PodcastId;
    private int RecommendationId;
    private String Password;
    private String bday;
    private UserRandomizer randomizer = new UserRandomizer();

    public User() {
        this.name = randomizer.generateRandomName();
        this.Email = randomizer.generateEmail();
        this.SubscriptionId = randomizer.generateSubscriptionId();
        this.PodcastId = randomizer.generatePodcastId();
        this.RecommendationId = randomizer.generateRecommendationId();
        this.Password = randomizer.generatePassword();
        this.bday = randomizer.generateRandomBDay();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public int getSubscriptionId() {
        return SubscriptionId;
    }

    public int getRecommendationId() {
        return RecommendationId;
    }

    public int getPodcastId() {
        return PodcastId;
    }

    public String getPassword() {
        return Password;
    }

    public String getBday() {
        return bday;
    }

    public UserRandomizer getRandomizer() {
        return randomizer;
    }

    public java.sql.Date getBirthday() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = formatter.parse(this.bday);
        return new java.sql.Date(parsedDate.getTime());
    }
}
