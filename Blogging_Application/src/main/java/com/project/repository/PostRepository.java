package com.project.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByNameContaining(String name);
}
