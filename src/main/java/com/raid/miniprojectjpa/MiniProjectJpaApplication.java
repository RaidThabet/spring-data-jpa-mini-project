package com.raid.miniprojectjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniProjectJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniProjectJpaApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(
//        AuthorRepository repository // will be automatically injected
//    ) {
//        return args -> {
//            var author = Author.builder()
//                    .firstName("Raid")
//                    .lastName("Thabet")
//                    .age(22)
//                    .email("thabet@mail.com")
//                    .createdAt(LocalDateTime.now())
//                    .build();
//
//            repository.save(author);
//        };
//    }

}
