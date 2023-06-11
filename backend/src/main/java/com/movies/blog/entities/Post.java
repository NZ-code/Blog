package com.movies.blog.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
public class Post {
    public Post(String text, Discussion discussion) {
        this.text = text;
        this.discussion = discussion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Getter
    @Setter
    private  String text;

    @ManyToOne
    @JoinColumn(name="discussion")
    private Discussion discussion;
}
