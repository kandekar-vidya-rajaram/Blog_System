package com.project.service;

import java.util.List;
import com.project.entity.Post;

public interface PostService {

    Post savePost(Post post);

    List<Post> getAllPosts();

    Post getPostById(Long postId);

    void likePost(Long postId);

    List<Post> searchByName(String name);

    void deletePost(Long postId); // ✅ delete post
}
