package com.miniProjetoAS.music;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MusicRandomizer {
    private Random random = new Random();

    String generateRandomMusicName(){

        String MusicName;

        String name = firstPart[random.nextInt(0, firstPart.length)];
        String lastName = secondPart[random.nextInt(0, secondPart.length)];
        MusicName = name + " " + lastName;
        return MusicName;
    }

    public long SongDuration() {
        // Duração mínima de 1 minuto (60000 ms) e máxima de 10 minutos (600000 ms)
        return 60000L + random.nextInt(540000);
    }

    public int generateRandomPopularity(){
        return random.nextInt(5) + 1;
    }

    public int generateRandomAlbum(){
        return random.nextInt(15) + 1;
    }

    public int generateRandomMusicalGenre(){
        return random.nextInt(15) + 1;
    }

    public int generateRandomGenre(){
        return random.nextInt(2) + 1;
    }

    public int generateRandomMusicArtist(){
        return random.nextInt(15) + 1;
    }

    public String generateRandomDay() {
        long startMillis = 946684800000L;  // 01/01/2000
        long endMillis = 1735680000000L;   // 01/01/2025

        // Gerar um valor aleatório entre startMillis e endMillis
        Random random = new Random();
        long randomMillis = startMillis + (long) (random.nextDouble() * (endMillis - startMillis));

        // Converter o milissegundo gerado para uma data
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(randomMillis);

        // Zerando as partes de hora, minuto, segundo e milissegundo
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // Criando a data final
        Date randomDate = calendar.getTime();

        // Formatando a data para string no formato "dd/MM/yyyy"
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(randomDate);
    }

    String[] firstPart = {
            "Caminhos", "Sombras", "Luzes", "Ecos", "Versos",
            "Melodias", "Noturnos", "Reflexos", "Horizontes", "Sonhos",
            "Labirintos", "Segredos", "Eternidades", "Espelhos", "Auroras",
            "Passagens", "Estrelas", "Poemas", "Paisagens", "Fragmentos",
            "Cenários", "Ondas", "Lamentos", "Silêncios", "Promessas",
            "Lágrimas", "Revelações", "Chamas", "Abraços", "Mistérios",
            "Sussurros", "Cores", "Flores", "Invernos", "Primaveras",
            "Ventanias", "Almas", "Rumos", "Ventos", "Céus"
    };

    String[] secondPart = {
            "do Amanhã", "Perdidos", "do Silêncio", "da Alma", "da Noite",
            "Invisíveis", "do Horizonte", "de Vidro", "do Passado", "Esquecidos",
            "do Vento", "Eternos", "de Luz", "Encantados", "da Madrugada",
            "do Tempo", "da Vida", "do Mar", "de Fogo", "da Solidão",
            "Imortais", "do Infinito", "da Chuva", "da Saudade", "do Espelho",
            "do Crepúsculo", "do Sol", "Ocultos", "da Aurora", "da Terra",
            "da Sombra", "do Destino", "de Areia", "do Céu", "de Sangue",
            "da Esperança", "da Escuridão", "de Estrelas", "de Papel", "de Contos"
    };

}
