package com.vstech.gateway.postservice.service;

import com.vstech.gateway.postservice.model.Post;

import java.util.List;

/**
 * @author: vinay
 */
public interface PostService {

    Post getPostById(Long id);

    List<Post> getAllPost();
}
