package com.codeblog.service;

import java.util.List;

import com.codeblog.entity.Post;

public interface CodeblogService {

	List<Post> findAll();
	
	Post findById(Long id);
	
	Post save(Post post);
	
}
