package com.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeblog.entity.Post;

public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
