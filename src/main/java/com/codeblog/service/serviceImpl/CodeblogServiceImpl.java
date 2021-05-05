package com.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeblog.entity.Post;
import com.codeblog.repository.CodeblogRepository;
import com.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService{
	
	@Autowired
	CodeblogRepository codeblogRepository;
	

	@Override
	public List<Post> findAll() {
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

}
