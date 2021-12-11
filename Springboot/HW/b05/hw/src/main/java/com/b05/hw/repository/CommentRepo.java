package com.b05.hw.repository;

import com.b05.hw.model.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentRepo extends JpaRepository<Comment,Long>{
    
}
