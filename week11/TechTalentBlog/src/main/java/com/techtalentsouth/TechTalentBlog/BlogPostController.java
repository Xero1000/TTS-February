package com.techtalentsouth.TechTalentBlog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogPostController {
	
	@Autowired
    private BlogPostRepository blogPostRepository;
    private static List<BlogPost> posts = new ArrayList<>();
	
	@GetMapping(value="/")
    public String index(BlogPost blogPost, Model model) {
	    posts.removeAll(posts);	
	    for (BlogPost post : blogPostRepository.findAll()) {		
	    	posts.add(post);		
	    }
		model.addAttribute("posts", posts);
    	return "blogpost/index";
    }
	
	
	@GetMapping(value = "/blogposts/new")
	public String newBlog (BlogPost blogPost) {
	    return "blogpost/new";
	}
	
	@PostMapping(value = "/blogposts")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
		blogPostRepository.save(blogPost);
		model.addAttribute("title", blogPost.getTitle());
		model.addAttribute("author", blogPost.getAuthor());
		model.addAttribute("blogEntry", blogPost.getBlogEntry());
		model.addAttribute("id", blogPost.getId());
		return "blogpost/result";
    }
	
	@GetMapping("/blogposts/{id}")	
    public String editPostWithId(@PathVariable Long id, BlogPost blogPost, Model model) {
        Optional<BlogPost> post = blogPostRepository.findById(id);
        if (post.isPresent()) {	
            BlogPost actualPost = post.get();	
            model.addAttribute("blogPost", actualPost);	
        }
        return "blogpost/edit";
    }
	
    @PostMapping("/blogposts/update/{id}")
    public String updateExistingPost(@PathVariable Long id, BlogPost blogPost, Model model) {
        Optional<BlogPost> post = blogPostRepository.findById(id);
        if (post.isPresent()) {
            BlogPost actualPost = post.get();
            actualPost.setTitle(blogPost.getTitle());
            actualPost.setAuthor(blogPost.getAuthor());
            actualPost.setBlogEntry(blogPost.getBlogEntry());
            blogPostRepository.save(actualPost);
            model.addAttribute("title", actualPost.getTitle());
    		model.addAttribute("author", actualPost.getAuthor());
    		model.addAttribute("blogEntry", actualPost.getBlogEntry());
    		model.addAttribute("id", actualPost.getId());
        }
        return "blogpost/result";
    }

	
    @GetMapping("blogposts/delete/{id}")	
    public String deletePostById(@PathVariable Long id, BlogPost blogPost) {	
        blogPostRepository.deleteById(id);	
        return "blogpost/delete";	
    }
}