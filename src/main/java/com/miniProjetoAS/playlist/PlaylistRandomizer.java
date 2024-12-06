package com.miniProjetoAS.playlist;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class PlaylistRandomizer {

    private Random random = new Random();

    public  String generateRandomPlaylistName(){

        String person;

        String name = NameList[random.nextInt(0, NameList.length)];
        String lastName = lastNameList[random.nextInt(0, lastNameList.length)];
        person = name + " " + lastName+" Playlist";
        return person;
    }


    public String generateRandomPrivacy() {
        int variable = this.random.nextInt(1, 3);
        String privacy = "";
        switch (variable) {
            case 1:
                privacy = "Pública";
                break;
            case 2:
                privacy = "Privada";
                break;
        }
        return privacy;
    }


    public int generateSubscriptionId() {
        return random.nextInt(500) + 1;
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
    private String[] NameList = {
            "Aurora", "Céu", "Sol", "Mar", "Vento", "Chuva",
            "Luz", "Brisa", "Caminho", "Folha", "Coração",
            "Alma", "Destino", "Horizonte", "Estrela", "Fogo",
            "Água", "Terra", "Sombra", "Arco"
    };
    String[] lastNameList = {
            "Boreal", "Estrelado", "Poente", "Sereno", "Norte",
            "de Verão", "do Amanhecer", "Suave", "Perdido", "Caída",
            "Valente", "Livre", "Eterno", "Infinito", "Cintilante",
            "Flamejante", "Cristalina", "Vermelha", "Oculta", "Íris"
    };
}
