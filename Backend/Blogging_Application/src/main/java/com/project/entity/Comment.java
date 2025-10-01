package com.project.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private String postedBy;

    private LocalDateTime createdAt = LocalDateTime.now(); // auto-set creation time

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post; // maps to Post.id (both Long)
}
