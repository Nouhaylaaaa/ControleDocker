package org.example;

import org.example.entities.Client;
import org.example.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args){
        SpringApplication.run(ClientApplication.class,args);
    }
    @Bean
    CommandLineRunner initializeH2Database(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "Nouhayla Hnizil", Float.parseFloat("23")));
            clientRepository.save(new Client(Long.parseLong("2"), "Lahlalia Nabil", Float.parseFloat("22")));
            clientRepository.save(new Client(Long.parseLong("3"), "Kach Ghizlane", Float.parseFloat("22")));
        };
    }
    }

