package com.movies.blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return (List<Post>) postRepository.findAll();
    }
    @PostMapping("/posts")
    void postPost(@RequestBody Post post){
        postRepository.save(post);
    }
}
