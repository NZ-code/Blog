package com.movies.blog.repositories;

import com.movies.blog.entities.Discussion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussionRepository extends CrudRepository<Discussion, Long> {

}
