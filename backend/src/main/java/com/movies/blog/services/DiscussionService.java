package com.movies.blog.services;


import com.movies.blog.entities.Discussion;
import com.movies.blog.repositories.DiscussionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussionService {

    @Autowired
    private DiscussionRepository discussionRepository;

    public void createDiscussion(Discussion discussion){
        discussionRepository.save(discussion);
    }
    public List<Discussion> getDiscussions(){
        return (List<Discussion>) discussionRepository.findAll();
    }

}
