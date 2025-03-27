package com.raid.miniprojectjpa;

import com.github.javafaker.Faker;
import com.raid.miniprojectjpa.models.Author;
import com.raid.miniprojectjpa.models.Video;
import com.raid.miniprojectjpa.repositories.AuthorRepository;
import com.raid.miniprojectjpa.repositories.VideoRepository;
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
            AuthorRepository repository, // will be automatically injected
            VideoRepository videoRepository) {
        return args -> {
//            for (int i = 0; i < 50; i++) {
//                Faker faker = new Faker();
//                var author = Author.builder()
//                        .firstName(faker.name().firstName())
//                        .lastName(faker.name().lastName())
//                        .age(faker.number().numberBetween(18, 50))
//                        .email(faker.internet().emailAddress())
//                        .createdAt(LocalDateTime.now())
//                        .build();
//
//                repository.save(author);
//
//            }
//            var video = Video.builder()
//                    .name("abc")
//                    .length(3)
//                    .build();
//
//            videoRepository.save(video);
        };
    }

}
