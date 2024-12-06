package com.miniProjetoAS.user;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class UserRandomizer {
    private String fristName;
    private Random random = new Random();

    public String generateRandomName(){

        String person;

        String name = NameList[random.nextInt(0, NameList.length)];
        String lastName = lastNameList[random.nextInt(0, lastNameList.length)];
        person = name + " " + lastName;
        this.fristName = name;
        return person;
    }

    public String generateEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "outlook.com"};
        return fristName + "@" + domains[random.nextInt(0, domains.length)];
    }

    public int generatePodcastId() {
        return random.nextInt(20) + 1;
    }

    public int generateRecommendationId() {
        return random.nextInt(20) + 1;
    }

    public int generateSubscriptionId() {
        return random.nextInt(4) + 1;
    }

    public String generatePassword() {

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }

        return password.toString();

    }

    public String generateRandomBDay() {
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

    private final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    private String[] NameList = {
            "Ana", "Beatriz", "Carla", "Daniela", "Eduarda",
            "Fernanda", "Gabriela", "Isabela", "Juliana", "Karina",
            "Larissa", "Marta", "Natalia", "Olga", "Paula",
            "Quésia", "Rafaela", "Sandra", "Tatiane", "Ursula",
            "Vera", "Wanda", "Ximena", "Yasmin", "Zélia",
            "Amanda", "Bruna", "Catarina", "Diana", "Eliane",
            "Fabiola", "Gisele", "Helena", "Ivana", "Jéssica",
            "Karla", "Lúcia", "Marina", "Nicole", "Priscila",
            "Renata", "Sofia", "Thais", "Verônica", "Walquíria",
            "Xuxa", "Yara", "Zuleika", "Adriana", "Betina","André",
            "Bruno","Astrubal", "Carlos", "Daniel", "Eduardo",
            "Felipe", "Gabriel", "Henrique", "Igor", "João",
            "Kaio", "Lucas", "Marcelo", "Natan", "Otávio",
            "Paulo", "Quirino", "Rafael", "Sérgio", "Thiago",
            "Ulisses", "Vinícius", "Wesley", "Xander", "Yago",
            "Zé", "Alexandre", "Bruno", "Cláudio", "Diego",
            "Erick", "Fabiano", "Gustavo", "Hugo", "Ismael",
            "Jorge", "Kleber", "Leonardo", "Mário", "Nelson",
            "Ricardo", "Samuel", "Tiago", "Uéliton", "Vitor",
            "Wagner", "Xerxes", "Yuri", "Zico", "Adriano", "Cícero", "Cicinho",
            "Guilherme", "Lucas", "Luiz", "Pedro", "Fernando", "Cainã",
            "Hezequias"
    };

    String[] lastNameList = {
            "Souza", "Oliveira", "Silva", "Costa", "Almeida",
            "Pereira", "Rocha", "Santos", "Lima", "Martins",
            "Ferreira", "Rodrigues", "Dias", "Gomes", "Mendes",
            "Carvalho", "Alves", "Barbosa", "Pinto", "Torres",
            "Ribeiro", "Araújo", "Pires", "Nascimento", "Lopes",
            "Andrade", "Freitas", "Vieira", "Cardoso", "Campos",
            "Moraes", "Machado", "Ramos", "Monteiro", "Borges",
            "Castro", "Teixeira", "Matos", "Figueiredo", "Pacheco",
            "Martins", "Gonçalves", "Tavares", "Farias", "Lima",
            "Azevedo", "Ribeiro", "Melo", "Viana", "Sá",
            "Dantas", "Magalhães", "Telles", "Alvarenga", "Figueira",
            "Lima", "Macêdo", "Siqueira", "Carneiro", "Barata",
            "Xavier", "Pimentel", "Goulart", "Cavalcanti", "Barros",
            "Lins", "Saldanha", "Queiroz", "Zanetti", "Macedo",
            "Vilar", "César", "Monteiro", "Mendonça", "Campos",
            "Alencar", "Vieira", "Silveira", "Ferreira", "Ribeiro",
            "Pimentel", "Batalha", "Mota", "Costa", "Marques",
            "Cunha", "Siqueira", "Gomes", "Nunes", "Batista",
            "Lobo", "Araujo", "Severiano", "Peixoto", "Borges",
            "Tavares", "Mendes", "Machado", "Morais", "Castro",
            "Fontes", "Martins", "Barros", "Reis", "Lima",
            "Silva", "Vargas", "Ribeiro", "Lima", "Pereira", "Braga",
            "Diniz", "Braule", "Frota", "Lameu", "Barroso", "Dutra"
    };
}
