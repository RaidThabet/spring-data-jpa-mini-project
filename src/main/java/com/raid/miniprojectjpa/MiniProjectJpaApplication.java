package com.raid.miniprojectjpa;

import com.raid.miniprojectjpa.models.Author;
import com.raid.miniprojectjpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class MiniProjectJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniProjectJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
        AuthorRepository repository // will be automatically injected
    ) {
        return args -> {
            var author = Author.builder()
                    .firstName("Raid")
                    .lastName("Thabet")
                    .age(22)
                    .email("thabet@mail.com")
                    .createdAt(LocalDateTime.now())
                    .build();

            repository.save(author);
        };
    }

}
