package com.dev.ronel.post;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class PostService {

    private final RestClient restClient;

    public PostService(RestClient.Builder builder) {

        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build();
    }

    public List<Post> findAll() {

       return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {});
    }

    public Post findById(Integer id) {

        return  restClient.get()
                .uri("/posts/{id}",id)
                .retrieve()
                .body(Post.class);
    }
}
