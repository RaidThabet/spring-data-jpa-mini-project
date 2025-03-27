package com.raid.miniprojectjpa.repositories;

import com.raid.miniprojectjpa.models.Author;
import jakarta.persistence.NamedQuery;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Transactional
    List<Author> findByNamedQuery(@Param("age") int age);

    @Transactional
    @Modifying
    void updateByNamedQuery(@Param("age") int age);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthor(@Param("age") int age2, @Param("id") int id);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age")
    void updateAllAuthorsAges(int age);

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
