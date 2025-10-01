package com.project.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.entity.Comment;
import com.project.entity.Post;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
}
