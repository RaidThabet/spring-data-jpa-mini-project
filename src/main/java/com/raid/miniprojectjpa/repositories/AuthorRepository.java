package com.raid.miniprojectjpa.repositories;

import com.raid.miniprojectjpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    // select * from author where first_name = 'fname'
    List<Author> findAllByFirstName(String firstName);
    
    List<Author> findAllByFirstNameIgnoreCase(String firstName);

    // select * from author where first_name like '%fna%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    // select * from author where first_name like 'fna%'
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);

    // select * from author where first_name like '%fna'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);

    // select * from author where first_name in ('raid', 'thabet')
    List<Author> findAllByFirstNameInIgnoreCase(Collection<String> firstNames);
}
