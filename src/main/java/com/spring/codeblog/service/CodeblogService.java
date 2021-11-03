package com.spring.codeblog.service;
import java.util.List;

import com.spring.codeblog.model.Post;



public interface CodeblogService {

	List<Post> FindAll(); //
	Post findById(long id); //retorna um unico post
	Post save(Post post); //receber o post pra salvar no bd
	
	
}
