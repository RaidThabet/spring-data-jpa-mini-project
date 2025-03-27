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
            Faker faker = new Faker();
            for (int i = 0; i < 50; i++) {
                var author = Author.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .age(faker.number().numberBetween(18, 90))
                        .email(faker.internet().emailAddress())
                        .createdAt(LocalDateTime.now())
                        .build();

                repository.save(author);

            }

            // Update author with id=1
            var author = Author.builder()
                    .id(1) // if the provided id does not exist, a new record will be inserted into the database
                    .firstName("Raid")
                    .lastName("Thabet")
                    .age(22)
                    .email("thabet@mail.com")
                    .createdAt(LocalDateTime.now())
                    .build();
//            repository.save(author); // make the update


            // update Author a set a.age = 20 where a.id = 1
            repository.updateAuthor(24, 1);

//            repository.updateAllAuthorsAges(100);

            // find by named query
            repository.findByNamedQuery(60)
                    .forEach(System.out::println);

            // update with named query
            repository.updateByNamedQuery(22);


//            var video = Video.builder()
//                    .name("abc")
//                    .length(3)
//                    .build();
//
//            videoRepository.save(video);
        };


    }

}
