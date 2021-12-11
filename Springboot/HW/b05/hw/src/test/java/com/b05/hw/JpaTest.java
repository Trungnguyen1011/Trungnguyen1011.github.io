package com.b05.hw;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.PersistenceUtil;

import com.b05.hw.model.Comment;
import com.b05.hw.model.Post;
import com.b05.hw.model.User;
import com.b05.hw.repository.CommentRepo;
import com.b05.hw.repository.PostRepo;
import com.b05.hw.repository.UserRepo;

import org.hibernate.Hibernate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class JpaTest {
  @Autowired
  UserRepo uRepo;
  @Autowired
  PostRepo pRepo;
  @Autowired
  CommentRepo cRepo;

  public void addData() {

  }

  @Test
  public void insertAndCascadeDataTest() {
    User user = new User("Trung");
    Post post1 = new Post("Post 1");
    Post post2 = new Post("Post 2");
    Comment comment1 = new Comment("hello");
    Comment comment2 = new Comment("nihao");
    Comment comment3 = new Comment("whats up homies");

    post1.addComment(comment1);
    post1.addComment(comment2);
    post2.addComment(comment3);

    user.addPost(post1);
    user.addPost(post2);
    user.addComment(comment1);
    user.addComment(comment2);
    user.addComment(comment3);
    // Cascade all
    uRepo.save(user);
    assertTrue(uRepo.findAll().size() >= 1);
    assertTrue(pRepo.findAll().size() >= 0);
    assertTrue(cRepo.findAll().size() >= 0);
    // orphan remove
    user.removeComment(comment1);
    post1.removeComment(comment1);
    assertTrue(cRepo.findAll().size() < 3);

  }

  @PersistenceContext
  EntityManager em;

  @Test
  public void fetchTypeTest() {
    User user = new User("Trung");
    Post post1 = new Post("Post 1");
    Post post2 = new Post("Post 2");
    Comment comment1 = new Comment("hello");
    Comment comment2 = new Comment("nihao");
    Comment comment3 = new Comment("whats up homies");

    post1.addComment(comment1);
    post1.addComment(comment2);
    post2.addComment(comment3);

    user.addPost(post1);
    user.addPost(post2);
    user.addComment(comment1);
    user.addComment(comment2);
    user.addComment(comment3);

    uRepo.save(user);
    // System.out.println(uRepo.findAll());
    // System.out.println(cRepo.findAll());

    // Lazy load
    em.clear();
    User userTest1 = uRepo.findById(1L).get();
    assertTrue(!Hibernate.isInitialized(userTest1.getPosts()));
    // Eager load
    em.clear();
    User userTest2 = uRepo.findById(1L).get();
    assertTrue(Hibernate.isInitialized(userTest2.getComments()));

  }
}
