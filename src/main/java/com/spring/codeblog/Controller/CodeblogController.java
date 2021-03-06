package com.spring.codeblog.Controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.service.CodeblogService;

@Controller
public class CodeblogController {

	@Autowired
	CodeblogService codeblogService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)//uri do cliente
	public ModelAndView getPosts() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = codeblogService.FindAll();
		mv.addObject("posts", posts);
		return mv;
		
	} 
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)//uri do cliente
	public ModelAndView getPostDetails(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("postDetails");
		Post post = codeblogService.findById(id);//buscando o post pelo id
		mv.addObject("post", post); //passando o post para ser mostrado na view
		return mv;
		
	} 
	
	//criando formulario para preencher os posts
	@RequestMapping(value = "/newpost", method = RequestMethod.GET)
	public String getPostForm() {
		return "postForm";
	}
	
	@RequestMapping(value = "/newpost", method = RequestMethod.POST)
	public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes ) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "verifique os campos!");
			return "redirect:/newpost";
		}
		post.setData(LocalDate.now());
		codeblogService.save(post);
		return "redirect:/posts";
	}
	
	
}
