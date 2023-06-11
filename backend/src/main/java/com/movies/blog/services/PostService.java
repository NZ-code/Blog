package com.movies.blog.services;


import com.movies.blog.entities.Post;
import com.movies.blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public void createPost(Post post){
        postRepository.save(post);
    }

    public List<Post> getPosts(){
        return (List<Post>) postRepository.findAll();
    }

}
