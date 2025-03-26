package com.raid.miniprojectjpa.repositories;

import com.raid.miniprojectjpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
