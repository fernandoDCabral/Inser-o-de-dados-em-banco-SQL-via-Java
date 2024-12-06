package com.miniProjetoAS.favorites;

import java.util.Random;

public class FavoritesRandomizer {

    private Random random = new Random();

    public int generateUserId() {
        return random.nextInt(1000) + 1;
    }

    public int generateMusicId() {
        return random.nextInt(150) + 1;
    }
}
