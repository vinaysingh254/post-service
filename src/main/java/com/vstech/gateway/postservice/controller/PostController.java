package com.vstech.gateway.postservice.controller;

import com.vstech.gateway.postservice.model.Post;
import com.vstech.gateway.postservice.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: vinay
 */
@RestController
@RequestMapping("/post")
public class PostController {

    public static final Logger LOGGER = LoggerFactory.getLogger(PostController.class);
    @Autowired
    PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable("id") Long id) {
        LOGGER.debug("Inside getPostById(). id = {}", id);
        Post postById = postService.getPostById(id);
        LOGGER.debug("Response : {}", postById);
        return ResponseEntity.ok(postById);
    }

    @GetMapping
    public ResponseEntity<List<Post>> getPosts() {
        LOGGER.debug("Inside getPosts()....");
        List<Post> allPost = postService.getAllPost();
        LOGGER.debug("Response : {}", allPost);
        return ResponseEntity.ok(allPost);
    }
}
