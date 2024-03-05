package com.dev.ronel.post;


import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {


    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping("")
    List<Post> findAll(){

        return postService.findAll();
    }

    @GetMapping("/{id}")
    Post findById(@PathVariable Integer id){

        return postService.findById(id);
    }


    @GetMapping("/in/")
    public HttpEntity<?> iAmIn(){
        return ResponseEntity.ok("Hello");
    }
}
