package com.movies.blog.controllers;

import com.movies.blog.entities.Discussion;
import com.movies.blog.repositories.DiscussionRepository;
import com.movies.blog.services.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DiscussionController {
    @Autowired
    private DiscussionService discussionService;

    @GetMapping("/discussions")
    public List<Discussion> getDiscussions(){
        return (List<Discussion>) discussionService.getDiscussions();
    }
    @PostMapping("/discussions")
    void postDiscussion(@RequestBody Discussion discussion){
        discussionService.createDiscussion(discussion);
    }
}
