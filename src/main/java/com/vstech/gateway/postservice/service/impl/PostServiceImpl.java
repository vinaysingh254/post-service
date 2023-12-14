package com.vstech.gateway.postservice.service.impl;

import com.vstech.gateway.postservice.model.Post;
import com.vstech.gateway.postservice.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: vinay
 */
@Service
public class PostServiceImpl implements PostService {

    @Override
    public Post getPostById(Long id) {
        return getPost(id);
    }

    @Override
    public List<Post> getAllPost() {
        return List.of(getPost(1l));
    }

    private Post getPost(Long id) {
        return Post.builder()
                .id(id)
                .title("Test title")
                .description("Test description")
                .build();
    }
}
