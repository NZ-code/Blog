package com.movies.blog.controllers;
import com.movies.blog.entities.Post;
import com.movies.blog.repositories.PostRepository;
import com.movies.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return (List<Post>) postService.getPosts();
    }
    @PostMapping("/posts")
    void postPost(@RequestBody Post post){
        postService.createPost(post);
    }
}
