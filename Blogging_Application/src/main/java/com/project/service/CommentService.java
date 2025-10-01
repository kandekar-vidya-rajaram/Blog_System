package com.project.service;

import java.util.List;
import java.util.Optional;
import com.project.entity.Comment;

public interface CommentService {

    Comment createComment(Long postId, String postedBy, String content);

    List<Comment> getCommentByPostId(Long postId);

    Optional<Comment> getCommentById(Long commentId);

    void deleteComment(Long commentId);
}
