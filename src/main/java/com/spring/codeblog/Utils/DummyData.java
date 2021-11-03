package com.spring.codeblog.Utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.stereotype.Component; 

@Component
public class DummyData {

	@Autowired
	CodeblogRepository codeblogRepository; //ponto de injecao do metodo
	
	
	//@PostConstruct //tudo que for colocado dentro do metodo sera...
	public void savePosts() {
		List<Post> postList = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAutor("Andrew Mallet");
		post1.setData(LocalDate.now());
		post1.setTitulo("Ping");
		post1.setTexto("This is something we all can do as no special services are required. This will simplify\n"
				+ "the ping command for console users who may not know the details of the command.\n"
				+ "This will ping the server for just three counts rather than the normal infinite amount.\n"
				+ "There is no output if the server is alive but a failed server reports Sever dead. Create\n"
				+ "the script as $HOME/bin/ping_server.sh:");
		
		Post post2 = new Post();
		post2.setAutor("Fausto Silva");
		post2.setData(LocalDate.now());
		post2.setTitulo("open SSH");
		post2.setTexto("Often SSH is installed and running on servers, so you may be able to run this script\n"
				+ "if your system is running SSH or you have access to an SSH server. In this script,\n"
				+ "we prompt for the server address and username and pass them through to the SSH\n"
				+ "client. Create the script as $HOME/bin/connect_server.sh:");
		
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	
	}
}
