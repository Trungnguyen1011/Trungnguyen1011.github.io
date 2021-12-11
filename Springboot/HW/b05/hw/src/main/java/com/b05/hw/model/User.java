package com.b05.hw.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "user")
    private List<Comment> comments = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "user")
    private List<Post> posts = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }


    public void addComment(Comment comment) {
        comment.setUser(this);
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comment.setUser(null);
        comments.remove(comment);
    }

    public void addPost(Post post) {
        post.setUser(this);
        posts.add(post);
       
    }

    public void removePost(Post post) {
        post.setUser(null);
        posts.remove(post);
    }


    @Override
    public String toString() {
        return "User [comments=" + ", id=" + id + ", name=" + name + ", posts="  + "]";
    }

    
}
