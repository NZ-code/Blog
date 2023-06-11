package com.movies.blog;

import com.movies.blog.entities.Discussion;
import com.movies.blog.entities.Post;
import com.movies.blog.repositories.DiscussionRepository;
import com.movies.blog.repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {

		SpringApplication.run(BlogApplication.class, args);
	}
	@Bean
	CommandLineRunner init(PostRepository postRepository, DiscussionRepository discussionRepository){

		return args -> {



		};
	}

}
