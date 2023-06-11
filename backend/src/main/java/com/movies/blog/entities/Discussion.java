package com.movies.blog.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
public class Discussion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Discussion(String header, String text) {
        this.header = header;
        this.text = text;
    }
    @Override
    public String toString(){
        return "Discussion:" + this.header + " | " + this.text;
    }
    @Getter
    @Setter
    private String header;
    @Getter
    @Setter
    private String text;

    @OneToMany(mappedBy = "discussion", fetch = FetchType.LAZY)
    private List<Post> posts;

}
