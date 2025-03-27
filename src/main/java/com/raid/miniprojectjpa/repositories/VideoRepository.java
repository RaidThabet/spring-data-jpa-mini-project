package com.raid.miniprojectjpa.repositories;

import com.raid.miniprojectjpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
