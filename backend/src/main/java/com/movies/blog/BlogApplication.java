package com.movies.blog;

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
	CommandLineRunner init(PostRepository postRepository){
		return args -> {
			Stream.of("Hahah", "Nice one").forEach(text -> {
				Post post = new Post(text);
				postRepository.save(post);
			});
			postRepository.findAll().forEach(System.out::println);
		};
	}

}
